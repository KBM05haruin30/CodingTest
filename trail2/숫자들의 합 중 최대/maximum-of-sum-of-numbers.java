import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.

        int ans = 0;

        for (int i = x; i <= y; i++)
        {
            ans = Math.max(ans, digitSum(i));
        }
        System.out.println(ans);
    }

    public static int digitSum(int n)
    {
        if (n < 10)
        {
            return n;
        } else
        {
            return digitSum(n/10) + (n%10);
        }
    } 
}