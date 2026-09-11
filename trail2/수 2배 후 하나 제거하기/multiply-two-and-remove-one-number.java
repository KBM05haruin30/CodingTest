import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
        {
            arr[i] *= 2;

            for (int j = 0; j < n; j++)
            {
                int[] remaining = new int[n-1];
                int cnt = 0;
                for (int k = 0; k < n; k++)
                {
                    if (j != k)
                    {
                        remaining[cnt++] = arr[k];
                    }
                }
                
                int sumDiff = 0;
                for (int k = 0; k < n - 2; k++)
                {
                    sumDiff += Math.abs(remaining[k+1] - remaining[k]);
                }
                ans = Math.min(ans, sumDiff);
            }

            arr[i] /= 2;
        }
        System.out.println(ans);
    }
}