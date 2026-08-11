import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        if (n % 2 == 0)
        {
            System.out.print(sum2(n));
        } else
        {
            System.out.print(sum1(n));
        }
    }

    public static int sum1(int n)
    {
        if (n == 1)
        {
            return 1;
        }

        return sum1(n-2) + n;
    }
    public static int sum2(int n)
    {
        if (n == 2)
        {
            return 2;
        }

        return sum2(n-2) + n;
    }
}