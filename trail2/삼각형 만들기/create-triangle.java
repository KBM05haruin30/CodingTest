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
        for (int i = 0; i < n; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                for (int k = j+1; k < n; k++)
                {
                    if ((y[i] == y[j] && (x[k] == x[i] || x[k] == x[j])) ||
                        (y[i] == y[k] && (x[j] == x[i] || x[j] == x[k])) ||
                        (y[j] == y[k] && (x[i] == x[j] || x[i] == x[k])))
                        {
                            int width = Math.abs((x[i]*y[j] + x[j]*y[k] + x[k]*y[i]) - (x[j]*y[i] + x[k]*y[j] + x[i]*y[k]));
                            ans = Math.max(ans, width);
                        }
                    
                }
            }
        }
        System.out.println(ans);
    }
}