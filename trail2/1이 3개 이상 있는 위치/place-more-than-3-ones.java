import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        int ans = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                int cnt = 0;
                for (int k = 0; k < 4; k++)
                {
                    int nx = i; int ny = j;
                    nx += dx[k];
                    ny += dy[k];
                    if (inRange(nx, ny, n) && arr[nx][ny] == 1)
                    {
                        cnt++;
                    }
                }
                if (cnt >= 3)
                {
                    ans++;
                }
            }
        }
        System.out.print(ans);

    }

    public static boolean inRange(int x, int y, int N)
    {
        if (0 <= x && x < N && 0 <= y && y < N)
        {
            return true;
        } else
        {
            return false;
        }
    }
}