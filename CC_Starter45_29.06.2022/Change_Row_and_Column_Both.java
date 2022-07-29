import java.util.*;

public class Change_Row_and_Column_Both {

    int getCount(int sx, int sy, int ex, int ey) {

        int count = 1;

        // while(sx == ex || sy == ey){
        // if(sx == ex)
        // }

        if (sx == ex || sy == ey)
            count++;

        return count;
    }

    public static void main(String[] args) {
        int sx, sy, ex, ey;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][4];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); // sx
            arr[i][1] = sc.nextInt(); // sy
            arr[i][2] = sc.nextInt(); // ex
            arr[i][3] = sc.nextInt(); // ey

        }

        Change_Row_and_Column_Both caps = new Change_Row_and_Column_Both();

        for (int i = 0; i < n; i++) {
            int res = caps.getCount(arr[i][0], arr[i][1], arr[i][2], arr[i][3]);
            System.out.println(res);

        }

    }
}