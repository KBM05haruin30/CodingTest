import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(f(n, 0));
    }

    public static int f(int n, int cnt)
    {
        if (n == 1)
        {
            return cnt;
        }
        if (n % 2 == 0)
        {
            return f(n/2, cnt+1);
        } else
        {
            return f(n*3+1, cnt+1);
        }
    }
}