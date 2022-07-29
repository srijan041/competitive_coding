import java.util.*;

public class Adjacent_Sum_Parity {

    void printYesNo(int[] B, int t) {
        int[] A = new int[t];

        for (int i = 0; i < B.length - 1; i++) {
            if (i == 0) {
                if (B[i] == 1) {
                    A[i] = 1;
                    A[i + 1] = 0;
                } else {
                    A[i] = 0;
                    A[i + 1] = 0;
                }
            }

            else if (i < t - 1) {
                // if (B[i] == 0)
                A[i + 1] = (B[i] + A[i]) % 2;
            }

        }

        if ((A[0] + A[t - 1]) % 2 == B[t - 1])
            System.out.print("\nYES");
        else
            System.out.print("\nNO");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Adjacent_Sum_Parity caps = new Adjacent_Sum_Parity();

        int n = sc.nextInt(); // no of test case
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int arr[] = new int[t];

            for (int j = 0; j < t; j++)
                arr[j] = sc.nextInt();

            caps.printYesNo(arr, t);
            // sc.next();

        }

    }
}