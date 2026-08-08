import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        if (isMagic(n))
        {
            System.out.print("Yes");
        } else
        {
            System.out.print("No");
        }
    }

    public static boolean isMagic(int n)
    {
        return n % 2 == 0 && (n/10 + n%10) % 5 == 0;
    }
}