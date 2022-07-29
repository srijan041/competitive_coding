import java.util.*;

public class Best_of_Two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i][0] > arr[i][1])
                System.out.println(arr[i][0]);
            else
                System.out.println(arr[i][1]);

        }

    }
}