import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i <= N; i++)
        {
            if (N % i == 0)
            {
                cnt++;
            }
            if (cnt > 2)
            {
                break;
            }
        }
        if (cnt == 2)
        {
            System.out.print("P");
        } else
        {
            System.out.print("C");
        }
    }
}