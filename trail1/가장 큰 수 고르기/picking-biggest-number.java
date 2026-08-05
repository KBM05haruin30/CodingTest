import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        final int INT_MIN = Integer.MIN_VALUE;
        int max = INT_MIN;
        for (int i = 0; i < 10; i++)
        {
            int num = sc.nextInt();
            if (num > max)
            {
                max = num;
            }
        }
        System.out.print(max);
    }
}