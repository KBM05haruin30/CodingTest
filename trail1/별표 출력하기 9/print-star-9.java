import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++)
        {
            for (int j = 2*(N-i); j > 0; j--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2-1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}