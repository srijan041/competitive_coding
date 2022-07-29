
import java.util.*;
import java.io.*;

public class C_Train_and_Queries {
    // For fast input output
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            try {
                br = new BufferedReader(
                        new FileReader("input.txt"));
                PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
                System.setOut(out);
            } catch (Exception e) {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static int findIndex(int arr[], int key) {

        if (arr == null) {
            return -1;
        }

        int len = arr.length;
        int i = 0;

        while (i < len) {

            if (arr[i] == key) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    // end of fast i/o code
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int T = reader.nextInt(); // test cases

        while (T > 0) {
            int len = reader.nextInt();
            int stations[] = new int[len];
            for (int i = 0; i < len; i++) {
                stations[i] = reader.nextInt();
            }

            int queryCount = reader.nextInt();
            int[][] query_list = new int[queryCount][2];
            for (int i = 0; i < len; i++) {
                query_list[i][0] = reader.nextInt();
                query_list[i][1] = reader.nextInt();

            }

            for (int i = 0; i < queryCount; i++) {
                int a = findIndex(stations, query_list[i][0]);
                int b = findIndex(stations, query_list[i][1]);
                if (a < b && a != -1 && b != -1)
                    System.out.print("\nYES");
                else
                    System.out.print("\nNO");

            }

            T--;
        }

    }
}