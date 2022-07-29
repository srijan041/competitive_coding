import java.util.*;

public class Even_Equal_Odd {

    // A*2
    // a/2

    int getNumOps(int[] arr, int n) {
        int oddCount = 0;
        int evenCount = 0;

        int numOps = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        while (oddCount != evenCount) {
            if (evenCount > oddCount) {
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 == 0 && (arr[i] / 2) % 2 == 1) {

                        arr[i] = arr[i] / 2;
                        numOps++;
                        oddCount++;
                        evenCount--;
                        break;
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 == 1) {
                        arr[i] = arr[i] * 2;
                        numOps++;
                        evenCount++;
                        oddCount--;
                        break;
                    }

                }

            }
        }
        return numOps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Even_Equal_Odd caps = new Even_Equal_Odd();

        int k = sc.nextInt(); // test case

        for (int i = 0; i < k; i++) {
            int n = 2 * sc.nextInt();

            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int res = caps.getNumOps(arr, n);
            System.out.print("\n" + res);

        }

    }
}