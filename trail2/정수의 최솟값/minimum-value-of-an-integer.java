import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(min_num(a, b, c));
    }

    public static int min_num(int a, int b, int c)
    {
        return ((a>b?b:a)>(b>c?c:b)?(b>c?c:b):(a>b?b:a));
    }
}