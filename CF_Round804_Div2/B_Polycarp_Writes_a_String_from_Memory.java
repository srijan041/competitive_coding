
import java.util.*;
import java.io.*;

public class B_Polycarp_Writes_a_String_from_Memory {
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

    // end of fast i/o code
    public static void main(String[] args) {
        FastReader reader = new FastReader();

        int T = reader.nextInt(); // test cases
        int numOfCharacters = 0;
        char[] arr = new char[3];
        while (T > 0) {
            int numOdDays = 0;
           

            String str = reader.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int k = 0;

                if(arr == null){
                    arr[k++] = ch;
                    numOdDays++;
                }

                while(k < 3){
                    if(ch == arr[k])
                        arr[k]++;
                    if(arr[k] == null)
                        arr[k] = ch;
                }

                

                

            }


            T--;
        }

    }
}