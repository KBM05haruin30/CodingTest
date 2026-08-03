import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < 2*N; i++)
        {
            if (i % 2 == 0)
            {
                for (int j = i/2; j < N; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            } else
            {
                for (int j = 0; j < i/2+1; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}