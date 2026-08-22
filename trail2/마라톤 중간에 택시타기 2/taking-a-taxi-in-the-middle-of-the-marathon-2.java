import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int min_dist = Integer.MAX_VALUE;

        for (int i = 1; i < n-1; i++)
        {
            int dist = 0;
            for (int j = 0; j < n-1; j++)
            {
                if (j+1 == i)
                {
                    dist += Math.abs(x[j] - x[j+2]) + Math.abs(y[j] - y[j+2]);
                    j++;
                }
                else
                {
                    dist += Math.abs(x[j] - x[j+1]) + Math.abs(y[j] - y[j+1]);
                }
            }
            if (min_dist > dist)
            {
                min_dist = dist;
            }
        }
        System.out.print(min_dist);
    }
}