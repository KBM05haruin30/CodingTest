import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean comb = false;
        for (int i = 2; i <= N-1; i++)
        {
            if (N % i == 0)
            {
                comb = true;
                break;
            }
        }
        if (comb == true)
        {
            System.out.print("C");
        } else
        {
            System.out.print("N");
        }
    }
}