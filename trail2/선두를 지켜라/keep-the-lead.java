import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a_dis = new int[1000001];
        int[] b_dis = new int[1000001];

        int[][] A = new int[n][2];
        int timeA = 1;
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
            while(A[i][1]-- > 0)
            {
                a_dis[timeA] = a_dis[timeA-1] + A[i][0];
                timeA++;
            }
        }

        int timeB = 1;
        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
            while(B[i][1]-- > 0)
            {
                b_dis[timeB] = b_dis[timeB-1] + B[i][0];
                timeB++;
            }
        }

        int cnt = 0;
        char first = 'o';
        for (int i = 1; i < timeA; i++)
        {
            if (a_dis[i] > b_dis[i])
            {
                if (first != 'a')
                {
                    first = 'a';
                    cnt++;
                }
            } else if (a_dis[i] < b_dis[i])
            {
                if (first != 'b')
                {
                    first = 'b';
                    cnt++;
                }
            }
        }

        System.out.print(cnt-1);
        // Please write your code here.
    }
}