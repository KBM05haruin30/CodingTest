import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            if (i % 2 == 0)
            {
                System.out.print("*");
            } else
            {
                for (int j = 0; j < i + 1; j++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}