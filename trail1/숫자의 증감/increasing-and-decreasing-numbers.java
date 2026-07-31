import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int N = sc.nextInt();
        if (c == 'A')
        {
            for(int i = 1; i <= N; i++)
            {
                System.out.print(i + " ");
            }
        } else if (c == 'D')
        {
            for (int i = N; i >= 1; i--)
            {
                System.out.print(i + " ");
            }
        }
    }
}