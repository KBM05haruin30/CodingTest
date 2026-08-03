import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("  ");
            }
            for(int j = 2*(N-i)-1; j > 0; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}