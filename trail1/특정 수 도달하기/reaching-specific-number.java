import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < 10; i++)
        {
            if (arr[i] < 250)
            {
                sum += arr[i];
                cnt++;
            }
            else
            {
                break;
            }
        }
        System.out.printf("%d %.1f", sum, (double)sum/cnt);
    }
}