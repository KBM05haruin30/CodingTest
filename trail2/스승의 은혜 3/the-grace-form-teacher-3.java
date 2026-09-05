import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        int[] s = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }
        // Please write your code here.

        int ans = 0;
        for (int i = 0; i < n; i++)
        {
            int[] temp = new int[n];
            for (int j = 0; j < n; j++)
            {
                if (i == j)
                {
                    temp[j] = p[j]/2 + s[j];
                } else
                {
                    temp[j] = p[j] + s[j];
                }
            }

            Arrays.sort(temp);
            int sum = 0;
            int cnt = 0;

            for (int j = 0; j < n; j++)
            {
                if (sum + temp[j] <= b)
                {
                    sum += temp[j];
                    cnt++;
                } else
                {
                    break;
                }
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }
}