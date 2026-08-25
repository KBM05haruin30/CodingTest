import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int max_val = Integer.MIN_VALUE;
        for (int i = 0; i < n-k+1; i++)
        {
            int sum = 0;
            for (int j = i; j < i + k; j++)
            {
                sum += arr[j];
            }
            max_val = Math.max(max_val, sum);
        }
        System.out.print(max_val);
    }
}