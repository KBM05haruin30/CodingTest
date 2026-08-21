import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        int startNum = sc.nextInt();
        // Please write your code here.
        int k = startNum - 1;
        int x = 0; int y = 0;
        int dirNum = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        if (k / n == 0)
        {
            x = 0;
            y = k % n;
            dirNum = 0;
        } else if (k / n == 1)
        {
            x = k % n;
            y = n - 1;
            dirNum = 1;
        } else if (k / n == 2)
        {
            x = n - 1;
            y = (n - 1) - (k % n);
            dirNum = 2;
        } else if (k / n == 3)
        {
            x = (n - 1) - (k % n);
            y = 0;
            dirNum = 3;
        }

        int ans = 0;
        while(inRange(x, y, n))
        {
            if (grid[x][y] == '/')
            {
                if (dirNum == 0)
                {
                    dirNum = 1;
                } else if (dirNum == 1)
                {
                    dirNum = 0;
                } else if (dirNum == 2)
                {
                    dirNum = 3;
                } else
                {
                    dirNum = 2;
                }
            } else
            {
                dirNum = 3 - dirNum;
            }

            ans++;

            x += dx[dirNum];
            y += dy[dirNum];
        }
        System.out.print(ans);
    }
    

    public static boolean inRange(int x, int y, int n)
    {
        if (0 <= x && x < n && 0 <= y && y < n)
        {
            return true;
        } else
        {
            return false;
        }
    }
}