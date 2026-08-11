import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printHello(n);
    }

    public static void printHello(int N)
    {
        if (N == 0)
        {
            return;
        }
        printHello(N-1);
        System.out.println("HelloWorld");
    }
}