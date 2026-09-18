import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            a[i] = sc.nextInt();
        // Please write your code here.
        for (int first = 1; first <= n; first++)
        {
            int[] ans = new int[n];
            boolean[] used = new boolean[n + 1];

            ans[0] = first;
            used[first] = true;
            boolean isValid = true;

            for (int i = 0; i < n - 1; i++)
            {
                int next = a[i] - ans[i];

                if (next < 1 || next > n || used[next])
                {
                    isValid = false;
                    break;
                }

                ans[i + 1] = next;
                used[next] = true;
            }

            if (isValid)
            {
                for (int i = 0; i < n; i++)
                {
                    System.out.print(ans[i] + (i == n - 1 ? "" : " "));
                }
                System.out.println();
                return;
            }
        }
    }
}