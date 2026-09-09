import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = 0;

        int min_h = Integer.MAX_VALUE;
        int max_h = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            min_h = Math.min(min_h, h[i]);
            max_h = Math.max(max_h, h[i]);
        }

        for (int i = 0; i <= max_h; i++)
        {
            int cnt = 0;
            for (int j = 0; j < n; j++)
            {
                if (h[j] > i && (j == 0 || h[j-1] <= i))
                {
                    cnt++;
                }
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }
}