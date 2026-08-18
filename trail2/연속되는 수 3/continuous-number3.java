import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        int ans = 0;
        for (int i = 0; i < N; i++)
        {
            if (i == 0 || arr[i]*arr[i-1] < 0)
            {
                cnt = 1;
            } else
            {
                cnt++;
            }
            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}