import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};
        int x = n/2;
        int y = n/2;
        int ans = board[x][y];
        int dirNum = 1;
        for (int i = 0; i < t; i++)
        {   
            int nx = x;
            int ny = y;
            char c = commands.charAt(i);
            if (c == 'L')
            {
                dirNum = (dirNum + 1) % 4;
            } else if (c == 'R')
            {
                dirNum = (dirNum - 1 + 4) % 4;
            } else
            {
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];
                if (!inRange(nx, ny, n))
                {
                    continue;
                } else
                {
                    x += dx[dirNum];
                    y += dy[dirNum];
                    ans += board[x][y];
                }
            }
        }
        System.out.print(ans);

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