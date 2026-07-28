import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        square(N);

    }

    private static void square(int n)
    {
        int cnt = 1;
        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(cnt + " ");
                if (cnt == 9 )
                {
                    cnt = 1;
                } else
                {
                    cnt++;
                }
            }
            System.out.println();
        }
    }
}