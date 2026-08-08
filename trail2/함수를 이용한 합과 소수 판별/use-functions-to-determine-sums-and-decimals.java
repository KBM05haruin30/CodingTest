import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 0;
        for (int i = A; i <= B; i++)
        {
            if (isPrime(i) && isEven(i))
            {
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static boolean isPrime(int n)
    {
        int cnt = 0;
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                cnt++;
            }
            if (cnt > 2)
            {
                break;
            }
        }
        if (cnt == 2)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean isEven(int n)
    {
        int sum = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++)
        {
            sum += (int)(s.charAt(i)-'0');
        }
        if (sum % 2 == 0)
        {
            return true;
        } else
        {
            return false;
        }
    }
}