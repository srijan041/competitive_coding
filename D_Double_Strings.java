
import java.util.*;
import java.io.*;

public class D_Double_Strings {
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

    static void sort(String[] s, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (s[j].length() > s[j + 1].length()) {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
    }

    static void checking(String str, String[] arr, int jIndex) {
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr.length; l++) {
                if (k != jIndex && l != jIndex) {
                    if (arr[k].concat(arr[l]) == str) {
                        System.out.print("1");
                        break;
                    }
                    if (k == arr.length - 1 - 1 && l == arr.length - 1) {
                        System.out.print("0");
                    }
                }
            }
        }
    }

    // end of fast i/o code
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int T = reader.nextInt();
        for (int i = 0; i < T; i++) {
            int n = reader.nextInt(); // number of strings
            String[] arr = new String[n];

            for (int j = 0; j < n; j++) {
                arr[j] = reader.nextLine().trim().toLowerCase();
            }
            for (int j = 0; j < n; j++) {
                checking(arr[j], arr, j);

            }
            System.out.println();
        }

    }
}
