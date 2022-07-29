
import java.util.*;
import java.io.*;

public class C_Cypher {
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
        int T = reader.nextInt();
        for (int i = 0; i < T; i++) {
            int n = reader.nextInt(); // number of wheels
            int[] wheels = new int[n];
            for (int j = 0; j < n; j++) {
                int num = reader.nextInt();
                wheels[j] = num;
            }

            for (int j = 0; j < n; j++) {
                String moves = reader.nextLine();
                int endIndex = 0;
                for (int z = 0; z < moves.length(); z++) {
                    char ch = moves.charAt(z);
                    if (ch == ' ') {
                        endIndex = z;
                        break;
                    }

                }
                int noOfMoves = Integer.parseInt(String.valueOf(moves.substring(0, endIndex)));
                moves = moves.substring(2).trim();

                for (int k = 0; k < noOfMoves; k++) {
                    char ch = moves.charAt(k);

                    if (ch == 'D') {
                        wheels[j]++;
                        if (wheels[j] == 10)
                            wheels[j] = 0;

                    } else if (ch == 'U') {
                        wheels[j]--;
                        if (wheels[j] == -1)

                            wheels[j] = 9;
                    }
                }
            }

            for (int j = 0; j < n; j++) {
                System.out.print(wheels[j] + " ");
            }

            System.out.println();
        }

    }
}