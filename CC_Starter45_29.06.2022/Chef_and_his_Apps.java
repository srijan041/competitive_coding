import java.util.*;

public class Chef_and_his_Apps {

    int getNumOfApps(int S, int X, int Y, int Z) {
        int sum = X + Y;
        int remain = S - sum;

        if (Z <= remain)
            return 0;
        else {
            if ((S - X) >= Z || (S - Y) >= Z)
                return 1;
            else
                return 2;
        }
    }

    public static void main(String[] args) {

        Chef_and_his_Apps caps = new Chef_and_his_Apps();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][4];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
            arr[i][3] = sc.nextInt();

        }

        for (int i = 0; i < n; i++) {
            int res = caps.getNumOfApps(arr[i][0], arr[i][1], arr[i][2], arr[i][3]);
            System.out.println(res);

        }

    }

}