import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= 100; i++)
        {
            if (arr[0] > i || arr[n-1] > i)
            {
                continue;
            }

            int[] availableIdx = new int[n];
            int cnt = 0;
            for (int j = 0; j < n; j++)
            {
                if(arr[j] <= i)
                {
                    availableIdx[cnt++] = j;
                }
            }
            boolean isTrue = true;
            for (int j = 1; j < cnt; j++)
            {
                int dist = availableIdx[j] - availableIdx[j-1];
                if (dist > k)
                {
                    isTrue = false;
                }
            }
            if (isTrue)
            {
                ans = Math.min(ans, i);
            }
        }
        System.out.println(ans);
    }
}