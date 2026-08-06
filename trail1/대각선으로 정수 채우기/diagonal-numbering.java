import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        int full = N + M - 1;

        int cnt = 1;
        int cnt2 = 0;
        for (int i = 0; i < full; i++)
        {
            if (i > M-1)
            {
                cnt2++;
            }
            for (int k = 0 + cnt2; k < i+1; k++)
            {
                if (k >= N)
                {
                    break;
                }
                arr[k][i-k] = cnt;
                cnt++;
            }
        }

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}