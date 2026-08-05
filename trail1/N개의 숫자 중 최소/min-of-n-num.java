import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int cnt = 0;
        int INT_MIN = Integer.MAX_VALUE;
        int min = INT_MIN;
        for (int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        for (int i = 0; i < N; i++)
        {
            if (arr[i] == min)
            {
                cnt++;
            }
        }
        System.out.print(min + " " + cnt);
    }
}