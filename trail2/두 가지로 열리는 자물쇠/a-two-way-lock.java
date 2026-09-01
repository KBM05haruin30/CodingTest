import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                for (int k = 1; k <= n; k++)
                {
                    boolean match1 = isNear(a, i, n) && isNear(b, j, n) && isNear(c, k, n);

                    boolean match2 = isNear(a2, i, n) && isNear(b2, j, n) && isNear(c2, k, n);

                    if (match1 || match2)
                    {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    public static boolean isNear(int x, int y, int n)
    {
        int diff = Math.abs(x - y);
        int dist = Math.min(diff, n - diff);
        return dist <= 2;
    }
}