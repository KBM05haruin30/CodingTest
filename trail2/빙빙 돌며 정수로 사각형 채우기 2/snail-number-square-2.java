import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};


        int[][] arr = new int[n][m];
        int x = 0; int y = 0;
        arr[x][y] = 1;
        int dir = 0;
        for (int i = 2; i <= n*m; i++)
        {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (!inRange(nx, ny, n, m) || arr[nx][ny] != 0)
            {
                dir = (dir + 1) % 4;
            }
            x += dx[dir];
            y += dy[dir];
            arr[x][y] = i;
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean inRange(int x, int y, int n, int m)
    {
        if (0 <= x && x < n && 0 <= y && y < m)
        {
            return true;
        } else
        {
            return false;
        }
    }
}