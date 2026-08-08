import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(mul(a,b));
    }

    public static int mul(int a, int b)
    {
        int n = 1;
        for (int i = 1; i <= b; i++)
        {
            n *= a;
        }
        return n;
    }
}