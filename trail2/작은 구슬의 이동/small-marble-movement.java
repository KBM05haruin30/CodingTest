import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        char D = sc.next().charAt(0);
        // Please write your code here.
        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};
        int dirNum = getDir(D);
        while(T-- > 0)
        {
            int nx = R + dx[dirNum];
            int ny = C + dy[dirNum];
            if (!inRange(nx, ny, N))
            {
                dirNum = 3 - dirNum;
                continue;
            }

            R = R + dx[dirNum];
            C = C + dy[dirNum];
        }
        System.out.print(R + " " + C);
    }

    public static int getDir(char c)
    {
        if (c == 'R')
        {
            return 0;
        } else if (c == 'D')
        {
            return 1;
        } else if (c == 'U')
        {
            return 2;
        } else
        {
            return 3;
        }
    }

    public static boolean inRange(int x, int y, int N)
    {
        if (0 < x && x <= N && 0 < y && y <= N)
        {
            return true;
        } else
        {
            return false;
        }
    }
}