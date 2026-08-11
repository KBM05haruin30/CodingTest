import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(F(n));
    }

    public static int F(int n)
    {
        int cnt = 0;
        if (n == 1)
        {
            return cnt;
        }

        if (n % 2 == 0)
        {
            cnt++;
            return F(n/2) + cnt;
        } else
        {
            cnt++;
            return F(n/3) + cnt;
        }
    }
}