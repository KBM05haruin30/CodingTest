import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int[][] arr = new int[n][n];
        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};
        int dirNum = 0;
        int x = n/2;
        int y = n/2;
        arr[x][y] = 1;;
        int stepLength = 1;
        int num = 2;
        while (num <= n * n)
        {
            for (int k = 0; k < 2; k++)
            {
                for (int step = 0; step < stepLength; step++)
                {
                    x += dx[dirNum];
                    y += dy[dirNum];

                    if (inRange(x, y, n))
                    {
                        arr[x][y] = num++;
                    }
                }
                dirNum = (dirNum + 1) % 4;
            }
            stepLength++;
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static boolean inRange(int nx, int ny, int n)
    {
        if (0 <= nx && nx < n && 0 <= ny && ny < n)
        {
            return true;
        } else
        {
            return false;
        }
    }
}