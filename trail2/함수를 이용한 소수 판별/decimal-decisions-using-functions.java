import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;
        for (int i = A; i <= B; i++)
        {
            if (isPrime(i))
            {
                sum += i;
            }
        }
        System.out.print(sum);
    }

    public static boolean isPrime(int i)
    {
        int cnt = 0;
        for (int k = 1; k <= i; k++)
        {
            if (i % k == 0)
            {
                cnt++;
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
}