import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++)
        {
            arr[i][0] = 1;
            for (int j = 0; j < N; j++)
            {
                if (i == j)
                {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 2; i < N; i++)
        {
            for (int j = 1; j < N; j++)
            {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < i+1; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}