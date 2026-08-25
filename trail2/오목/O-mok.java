import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int[] dx = {0, 1, 1, -1};
        int[] dy = {1, 0, 1, 1};
        for (int i = 0; i < 19; i++)
        {
            for (int j = 0; j < 19; j++)
            {
                if (arr[i][j] == 0)
                {
                    continue;
                }
                int color = arr[i][j];
                for (int k = 0; k < 4; k++)
                {
                    int cnt = 0;
                    for (int step = 0; step < 5; step++)
                    {
                        int nx = i + dx[k] * step;
                        int ny = j + dy[k] * step;

                        if (inRange(nx, ny) && arr[nx][ny] == color)
                        {
                            cnt++;
                        } else
                        {
                            break;
                        }
                    }
                    if (cnt == 5)
                    {
                        System.out.println(color);
                        int midX = i + dx[k] * 2 + 1;
                        int midY = j + dy[k] *  2 + 1;
                        System.out.println(midX + " " + midY);
                        return;
                    }
                }
            }
        }
        System.out.println(0);
    }

    public static boolean inRange(int x, int y)
    {
        if (0 <= x && x < 19 && 0 <= y && y < 19)
        {
            return true;
        }
        return false;
    }
}