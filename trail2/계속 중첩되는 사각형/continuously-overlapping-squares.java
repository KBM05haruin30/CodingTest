import java.util.Scanner;

public class Main {

    public static final int OFFSET = 100;
    public static final int MAX_R = 200;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] checked = new int[MAX_R+1][MAX_R+1];
        for (int i = 0; i < N; i++)
        {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            if (i % 2 == 0)
            {
                for (int x = x1; x < x2; x++)
                {
                    for (int y = y1; y < y2; y++)
                    {
                        checked[x][y] = 1;
                    }
                }
            } else
            {
                for (int x = x1; x < x2; x++)
                {
                    for (int y = y1; y < y2; y++)
                    {
                        checked[x][y] = 2;
                    }
                }
            }
        }

        int cnt = 0;
        for (int x = 0; x <= MAX_R; x++)
        {
            for (int y = 0; y <= MAX_R; y++)
            {
                if (checked[x][y] == 2)
                {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}