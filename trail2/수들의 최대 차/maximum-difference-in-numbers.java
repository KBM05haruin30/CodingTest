import java.util.Scanner;
import java.util.Arrays;
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
        int ans = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                if (arr[j]-arr[i] <= k)
                {
                    ans = Math.max(ans, j - i + 1);
                } else
                {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}