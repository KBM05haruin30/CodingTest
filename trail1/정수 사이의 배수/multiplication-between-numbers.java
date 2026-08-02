import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sumVal = 0;
        int cnt = 0;
        for (int i = A; i <= B; i++)
        {
            if ((i % 5 == 0) || (i % 7 == 0))
            {
                sumVal += i;
                cnt++;
            }
        }
        System.out.printf("%d %.1f", sumVal, (double)sumVal/cnt);
    }
}