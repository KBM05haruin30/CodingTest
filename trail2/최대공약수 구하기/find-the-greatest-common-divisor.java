import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        asd(n, m);

    }

    private static void asd(int n, int m)
    {
        int ans = 1;
        int min;
        if (n > m)
        {
            min = m;
        } else
        {
            min = n;
        }

        for (int i = 1; i <= min; i++)
        {
            if (n % i == 0 && m % i == 0)
            {
                ans = i;
            }
        }
        System.out.print(ans);
    }
}