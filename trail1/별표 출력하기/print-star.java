import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 1;
        for (int i = 1; i <= N*2-1; i++)
        {
            for (int j = 0; j < cnt; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            if (i < N)
            {
                cnt++;
            } else
            {
                cnt--;
            }

        }
    }
}