import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        String D = sc.next();
        // Please write your code here.
        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};
        int getDir = directNum(D);
        while(T-- > 0)
        {
            int nx = R + dx[getDir];
            int ny = C + dy[getDir];
            if (!inRange(nx, ny, N))
            {
                getDir = 3 - getDir;
                continue;
            }
            R = R + dx[getDir];
            C = C + dy[getDir];
        }

        System.out.println(R + " " + C);

    }

    public static boolean inRange(int x, int y, int n)
    {
        if (0 < x && x <= n && 0 < y && y <= n)
        {
            return true;
        }
        return false;
    }

    public static int directNum(String D)
    {
        if(D.equals("R"))
        {
            return 0;
        } else if (D.equals("D"))
        {
            return 1;
        } else if (D.equals("U"))
        {
            return 2;
        } else
        {
            return 3;
        }
    }
}