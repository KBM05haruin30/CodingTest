import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        int ans = 0;
        for (int i = 0; i < N; i++)
        {
            if (arr[i] > T)
            {
                cnt++;
            } else
            {
                cnt = 0;
            }
            ans = Math.max(ans, cnt);
        }
        System.out.print(ans);
    }
}