import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = N;
        for(int i = 1; i <= N*2-1; i++)
        {
            for (int j = cnt; j >= 1; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
            if(i < N)
            {
                cnt--;
            } else
            {
                cnt++;
            }

        }
    }
}