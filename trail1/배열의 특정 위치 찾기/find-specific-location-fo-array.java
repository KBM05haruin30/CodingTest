import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum2 = 0;
        int sum3 = 0;
        int cnt = 0;
        for (int i = 1; i <= 10; i++)
        {
            int num = sc.nextInt();
            if (i % 2 == 0)
            {
                sum2 += num;
            }
            if (i % 3 == 0)
            {
                sum3 += num;
                cnt++;
            }
        }
        System.out.printf("%d %.1f", sum2, (double)sum3/cnt);
    }
}