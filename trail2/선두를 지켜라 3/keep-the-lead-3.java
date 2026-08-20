import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a_dis = new int[1000001];
        int[] b_dis = new int[1000001];

        int[][] a = new int[n][2];
        int[][] b = new int[m][2];
        int timeA = 1;
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            while(a[i][1]-- > 0)
            {
                a_dis[timeA] = a_dis[timeA - 1] + a[i][0];
                timeA++;
            }
        }

        int timeB = 1;
        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
            while(b[i][1]-- > 0)
            {
                b_dis[timeB] = b_dis[timeB - 1] + b[i][0];
                timeB++;
            }
        }

        int ans = 0;
        int leader = 0;
        for (int i = 0; i < timeA; i++)
        {
            if (a_dis[i] > b_dis[i])
            {
                if (leader == 3 || leader == 2)
                {
                    ans++;
                }
                leader = 1;
            } else if (a_dis[i] < b_dis[i])
            {
                if (leader == 3 || leader == 1)
                {
                    ans++;
                }
                leader = 2;
            } else
            {
                if (leader == 1 || leader == 2)
                {
                    ans++;
                }
                leader = 3;
            }
        }
        System.out.print(ans);
        // Please write your code here.
    }
}