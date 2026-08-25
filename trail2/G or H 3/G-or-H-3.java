import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[10001];
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            if (c == 'G')
            {
                arr[pos] = 1;
            } else if ( c == 'H')
            {
                arr[pos] = 2;
            }
        }
        // Please write your code here.
        int max_val = 0;
        for (int i = 0; i <= 10000 - k; i++)
        {
            int sum = 0;
            for (int j = i; j <= i+k; j++)
            {
                sum += arr[j];
            }
            max_val = Math.max(max_val, sum);
        }
        System.out.print(max_val);
    }
}