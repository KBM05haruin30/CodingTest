import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int total_sum = cal(m, arr);
        System.out.print(total_sum);
    }

    public static int cal(int M, int[] arr)
    {
        int sum = 0;
        while(M > 0)
        {
            sum += arr[M];
            if (M % 2 != 0)
            {
                M -= 1;
            } else
            {
                M /= 2;
            }
        }
        return sum;
    }
}