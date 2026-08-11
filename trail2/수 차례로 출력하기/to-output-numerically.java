import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printN(n);
        System.out.println();
        printNreverse(n);
    }

    public static void printN(int n)
    {
        if (n == 0)
        {
            return;
        }

        printN(n-1);
        System.out.print(n + " ");
    }

    public static void printNreverse(int n)
    {
        if (n == 0)
        {
            return;
        }
        System.out.print(n + " ");
        printNreverse(n-1);
    }
}