import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A_age = sc.nextInt();
        char A_gen = sc.next().charAt(0);
        int B_age = sc.nextInt();
        char B_gen = sc.next().charAt(0);

        if ((A_age >= 19 && A_gen == 'M') || (B_age >= 19 && B_gen == 'M'))
        {
            System.out.print(1);
        } else
        {
            System.out.print(0);
        }
    }
}