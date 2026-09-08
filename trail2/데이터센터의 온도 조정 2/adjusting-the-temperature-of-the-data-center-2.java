import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int[] ta = new int[n];
        int[] tb = new int[n];
        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }
        // Please write your code here.

        int maxTa = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)
        {
            maxTa = Math.max(maxTa, tb[i]);
        }

        int max_val = 0;
        for (int i = -1; i <= maxTa + 10; i++)
        {
            int work = 0;
            for (int j = 0; j < n; j++)
            {
                if (i < ta[j])
                {
                    work += c;
                } else if (ta[j] <= i && i <= tb[j])
                {
                    work += g;
                } else
                {
                    work += h;
                }
            }
            max_val = Math.max(max_val, work);
        }
        System.out.println(max_val);
    }
}