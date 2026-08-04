import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 1;
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("  ");
            }
            for (int j = N-i; j > 0; j--)
            {
                System.out.print(cnt + " ");
                if (cnt != 9)
                {
                    cnt++;
                } else
                {
                    cnt = 1;
                }
            }
            System.out.println();
        }
    }
}