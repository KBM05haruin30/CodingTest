import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = Integer.MAX_VALUE;
        for (int i = 2; i <= 100; i+=2)
        {
            for (int j = 2; j <= 100; j+=2)
            {
                int q1 = 0;
                int q2 = 0;
                int q3 = 0;
                int q4 = 0;
                for (int k = 0; k < n; k++)
                {
                    if (x[k] < i && y[k] > j)
                    {
                        q1++;
                    } else if (x[k] > i && y[k] > j)
                    {
                         q2++;
                    } else if (x[k] < i && y[k] < j)
                    {
                        q3++;
                    } else if (x[k] > i && y[k] < j)
                    {
                        q4++;
                    }
                }
                int M = Math.max(Math.max(Math.max(q1, q2), q3), q4);
                ans = Math.min(ans, M);
            }
        }
        System.out.println(ans);
    }
}