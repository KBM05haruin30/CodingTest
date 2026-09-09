import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(arr);
        int ans1 = 0;
        for (int k = arr[0]; k <= arr[n-1]; k++)
        {
            int cnt = 0;
            for (int i = 0; i < n; i++)
            {
                for (int j = i + 1; j < n; j++)
                {
                    if (arr[j]-k < 0 || k-arr[i] < 0)
                    {
                        continue;
                    }
                    if ((arr[j]-k) == (k - arr[i]))
                    {
                        cnt++;
                    }
                }
            }
            ans1 = Math.max(cnt, ans1);
        }
        System.out.println(ans1);
    }
}