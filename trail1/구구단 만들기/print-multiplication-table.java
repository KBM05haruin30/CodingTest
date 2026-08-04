import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        for (int i = 1; i <= 9; i++)
        {
            for (int j = B; j >= A; j -=2)
            {
                System.out.print(j + " * " + i + " = " + (i*j));
                if (j != A)
                {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}