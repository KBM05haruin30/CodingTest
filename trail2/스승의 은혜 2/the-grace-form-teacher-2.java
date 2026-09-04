import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
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
                    temp[j] = p[j] / 2;
                } else
                {
                    temp[j] = p[j];
                }
            }

            Arrays.sort(temp);
            
            int sum = 0;
            int count = 0;
            
            for (int j = 0; j < n; j++)
            {
                if (sum + temp[j] <= b)
                {
                    sum += temp[j];
                    count++;
                } else
                {
                    break;
                }
            }
            ans = Math.max(ans, count);
        }
        System.out.println(ans);
    }
}