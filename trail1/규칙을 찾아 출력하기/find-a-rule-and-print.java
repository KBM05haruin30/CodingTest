import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            if (i == 0 || i == N - 1)
            {
                for (int j = 0; j < N; j++)
                {
                    System.out.print("* ");
                }
            } else
            {
                for (int j = 0; j < i; j++)
                {
                    System.out.print("* ");
                }
                for (int j = 0; j < N-(i+1); j++)
                {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}