import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] dir = new char[n];
        int[] dist = new int[n];
        for(int i = 0; i < n; i++){
            dir[i] = sc.next().charAt(0);
            dist[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};
        int x = 0;
        int y = 0;
        int ans = 0;
        boolean exis = false;
        for (int i = 0; i < n; i++)
        {
            int dirNum = directions(dir[i]);
            if (exis)
            {
                break;
            }
            for (int j = 0; j < dist[i]; j++)
            {
                x += dx[dirNum];
                y += dy[dirNum];
                ans++;
                if (x == 0 && y == 0)
                {
                    exis = true;
                    break;
                }
            }
        }
        if (exis)
        {
            System.out.print(ans);
        } else
        {
            System.out.print(-1);
        }

    }

    public static int directions(char dir)
    {
            if (dir == 'W')
            {
                return 0;
            } else if (dir == 'S')
            {
                return 1;
            } else if (dir == 'N')
            {
                return 2;
            } else
            {
                return 3;
            }
    }
}