import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
        {
            arr[i] = sc.nextInt();
            if (i % 2 == 0)
            {
                sum1 += arr[i];
            } else
            {
                sum2 += arr[i];
            }
        }
        System.out.print(sum1>sum2?sum1-sum2:sum2-sum1);
    }
}