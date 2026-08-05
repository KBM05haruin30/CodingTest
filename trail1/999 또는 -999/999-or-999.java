import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int INT_MIN = Integer.MAX_VALUE;
        int min = INT_MIN;
        int INT_MAX = Integer.MIN_VALUE;
        int max = INT_MAX;
        for (int i = 0; i < 100; i++)
        {
            int num = sc.nextInt();
            if (num == 999 || num == -999)
            {
                break;
            }
            if (num > max)
            {
                max = num;
            }
            if (num < min)
            {
                min = num;
            }
        }
        System.out.print(max + " " + min);
    }
}