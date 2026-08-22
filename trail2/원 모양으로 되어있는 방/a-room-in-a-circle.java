import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int min_val = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
        {
            int sumDiff = 0;
            int dist = 0;
            for (int j = i; j < n; j++)
            {
                sumDiff += dist * arr[j];
                dist++;
            }
            for (int j = 0; j < i; j++)
            {
                sumDiff += dist * arr[j];
                dist++;
            }
            if (min_val > sumDiff)
            {
                min_val = sumDiff;
            }
        }
        System.out.print(min_val);
    }
}