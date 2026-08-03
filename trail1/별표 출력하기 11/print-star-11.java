import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < 2*N + 1; i++)
        {
            if (i % 2 == 0)
            {
                for (int j = 0; j < 2*N + 1; j++)
                {
                    System.out.print("* ");
                }
            } else
            {
                for (int j = 0; j < N + 1; j++)
                {
                    System.out.print("*   ");
                }
            }
            System.out.println();
        }
    }
}