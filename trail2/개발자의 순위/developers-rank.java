import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int ans = 0;
        int[][] pair = new int[21][21];
        for (int i = 0; i < k; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int s = 0; s < n; s++)
                {
                    if (j == s || j > s)
                    {
                        continue;
                    }
                    pair[arr[i][j]][arr[i][s]]++;
                }
            }
        }
        for (int i = 1; i <= 20; i++)
        {
            for (int j = 1; j <= 20; j++)
            {
                if (pair[i][j] == k)
                {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}