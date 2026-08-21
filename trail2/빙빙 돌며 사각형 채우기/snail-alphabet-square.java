import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                arr[i][j] = '0';
            }
        }
        int x = 0; int y = 0;
        int dir = 0;
        char ans = 'A';
        arr[x][y] = ans;
        for (int i = 2; i <= n*m; i++)
        {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (!inRange(nx, ny, n, m) || arr[nx][ny] != '0')
            {
                dir = (dir + 1) % 4;
            }
            x += dx[dir];
            y += dy[dir];
            if (ans == 'Z')
            {
                ans = 'A';
            } else
            {
                ans = (char)((int)ans + 1);
            }
            arr[x][y] = ans;
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

    public static boolean inRange(int nx, int ny, int n, int m)
    {
        if(0 <= nx && nx < n && 0 <= ny && ny < m)
        {
            return true;
        } else
        {
            return false;
        }
    }
}