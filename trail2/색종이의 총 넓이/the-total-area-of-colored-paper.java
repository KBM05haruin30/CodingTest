import java.util.Scanner;

public class Main {

    public static final int OFFSET = 100;
    public static final int MAX_RANGE = 200;

    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] square = new int[MAX_RANGE+1][MAX_RANGE+1];
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++)
        {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            x[i] += OFFSET;
            y[i] += OFFSET;
            for (int j = x[i]; j < x[i]+8; j++)
            {
                for (int k = y[i]; k < y[i] + 8; k++)
                {
                    square[j][k] = 1;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < square.length; i++)
        {
            for (int j = 0; j < square[0].length; j++)
            {
                if (square[i][j] == 1)
                {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);

    }
}