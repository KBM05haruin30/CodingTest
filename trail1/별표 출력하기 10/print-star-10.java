import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N*2; i++)
        {
            if (i % 2 == 0)
            {
                for(int j = 0; j < i/2+1; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            } else
            {
                for (int j = N-i/2; j > 0; j--)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}