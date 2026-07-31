import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int i = 1;
        while (i <= 21)
        {
            if (i == 1)
            {
                System.out.print(A/B+".");
            }
            else
            {
                A = A%B * 10;
                System.out.print(A/B);
            }
            i++;
        }
    }
}