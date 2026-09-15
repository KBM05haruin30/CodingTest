import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        int ans = 0;

        for (int i = 1; i <= n; i++)
        {
            int sum = 0;
            int startIdx = i;
            int repeat = m;
            while(repeat-- > 0)
            {
                sum += arr[startIdx];
                startIdx = arr[startIdx];
            }
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }
}