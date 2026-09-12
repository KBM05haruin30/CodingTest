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
        int ans = 0;
        for (int i = 0; i <= 10; i++)
        {
            for (int j = 0; j <= 10; j++)
            {
                for (int k = 0; k <= 10; k++)
                {
                   for (int type = 0; type < 4; type++)
                   {
                        boolean isPossible = true;
                        for (int z = 0; z < n; z++)
                        {
                            boolean pass = false;
                            if (type == 0 && (x[z] == i || x[z] == j || x[z] == k))
                            {
                                pass = true;
                            }
                            if (type == 1 && (x[z] == i || x[z] == j || y[z] == k))
                            {
                                pass = true;
                            }
                            if (type == 2 && (x[z] == i || y[z] == j || y[z] == k))
                            {
                                pass = true;
                            }
                            if (type == 3 && (y[z] == i || y[z] == j || y[z] == k))
                            {
                                pass = true;
                            }

                            if (!pass)
                            {
                                isPossible = false;
                                break;
                            }
                        }
                        if (isPossible)
                        {
                            ans = 1;
                        }
                   }
                }
            }
        }
        System.out.println(ans);
    }
}