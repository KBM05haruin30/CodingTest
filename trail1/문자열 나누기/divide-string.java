import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = "";
        for (int i = 0; i < N; i++)
        {
            int num = sc.nextInt();
            s += num;
        }
        for (int i = 1; i <= s.length(); i++)
        {
            if (i % 5 == 0)
            {
                System.out.println(s.charAt(i-1));
            } else
            {
                System.out.print(s.charAt(i-1));
            }
        }
    }
}