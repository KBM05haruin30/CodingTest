import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Please write your code here.

        int min_val = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
        {
            int sumDist = 0;
            for (int j = 0; j < i; j++)
            {
                int diffDist = Math.abs(i-j);
                sumDist += diffDist * a[j];
            }
            for (int j = i; j < n; j++)
            {
                int diffDist = Math.abs(j - i);
                sumDist += diffDist * a[j];
            }
            if (sumDist < min_val)
            {
                min_val = sumDist;
            }
        }
        System.out.print(min_val);
    }
}