
import java.util.*;
import java.io.*;

public class Segmentation_Fault {
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
        try {
            int T = reader.nextInt(); // test cases
            while (T > 0) {
                int N = reader.nextInt(); // number of people
                int[] claims = new int[N];
                int truthlow = 1;
                int truthhigh = N;

                int arr[][] = new int[N][2];
                for (int i = 0; i < N; i++) {
                    arr[i][0] = reader.nextInt();
                    arr[i][1] = reader.nextInt();

                    if (arr[i][0] - 1 == i || arr[i][1] - 1 == i) {
                        if (arr[i][0] >= truthlow)
                            truthlow = arr[i][0];
                        if (arr[i][1] <= truthhigh)
                            truthhigh = arr[i][1];
                    }

                    for (int j = arr[i][0] - 1; j < arr[i][1]; j++) {
                        if (j + 1 >= truthlow && j <= truthhigh)
                            claims[j]++;
                    }

                }

                int max = claims[0];
                for (int i = 0; i < N; i++) {
                    if (claims[i] > max)
                        max = claims[i];
                }
                int count = 0;
                for (int i = 0; i < N; i++) {
                    if (claims[i] == max) {
                        count++;
                    }
                }
                System.out.println(count);
                for (int i = 0; i < N; i++) {
                    if (claims[i] == max) {
                        System.out.println(i + 1);
                    }
                }

                T--;

            }
        } catch (Exception e) {
            return;
        }

    }

}
