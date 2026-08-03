import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = N;
        for(int i = 0; i < N * 2 - 1; i++)
        {
            for (int j = 0; j < N - cnt; j++)
            {
                System.out.print("  ");
            }
            for (int j = 0; j < cnt * 2 - 1; j++)
            {
                System.out.print("* ");
            }
            if (i < N-1)
            {
                cnt--;
            } else
            {
                cnt++;
            }
            System.out.println();
        }
    }
}