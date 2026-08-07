import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        int an = (int)a;
        int bn = (int)b;
        System.out.print((an + bn) + " ");
        if (a > b)
        {
            System.out.print(an-bn);
        } else
        {
            System.out.print(bn - an);
        }
    }
}