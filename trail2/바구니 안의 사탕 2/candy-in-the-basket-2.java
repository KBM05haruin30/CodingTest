import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[101];
        for (int i = 0; i < n; i++) {
            int candy = sc.nextInt();
            int position = sc.nextInt();
            arr[position] += candy;
        }
        // Please write your code here.

        int maxCandy = 0;
        for (int c = 0; c <= 100; c++)
        {
            int sum = 0;
            for (int i = Math.max(0, c-k); i <= Math.min(100, c+k); i++)
            {
                sum+=arr[i];
            }
            maxCandy = Math.max(sum, maxCandy);
        }
        System.out.println(maxCandy);
    }
}