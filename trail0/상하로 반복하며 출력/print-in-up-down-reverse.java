import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for(int j = 0; j < N; j++)
        {
            if (j % 2 == 0)
            {
                for (int i = 0; i < N; i++)
                {
                    arr[i][j] = i+1;
                }
            } else
            {
                for (int i = N-1; i >= 0; i--)
                {
                    arr[i][j] = N - i;
                }
            }
        }

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}