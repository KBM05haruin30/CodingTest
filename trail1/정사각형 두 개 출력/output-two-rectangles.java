import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < 2; i++)
        {
            for (int j = 0; j < N; j++)
            {
                for (int k = 0; k < N; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (i == 0)
            {
                System.out.println();
            }
        }
    }
}