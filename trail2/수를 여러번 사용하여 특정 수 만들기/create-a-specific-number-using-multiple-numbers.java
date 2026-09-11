import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int maxSubA = C / A + 1;
        int maxSubB = C / B + 1;


        int ans = 0;
        for (int i = 0; i <= maxSubA; i++)
        {
            for (int j = 0; j <= maxSubB; j++)
            {
                int num = A * i + B * j;
                if (num <= C)
                {
                    ans = Math.max(ans, num);
                }
            }
        }
        System.out.println(ans);
    }
}