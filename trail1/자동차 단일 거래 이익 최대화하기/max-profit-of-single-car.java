import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        int min = 0;
        for (int i = 0; i < N-1; i++)
        {
            for (int j = 1+i; j < N; j++)
            {
                if ((arr[i] - arr[j]) < min)
                {
                    min = arr[i]-arr[j];
                }
            }
        }
        System.out.print(-min);
    }
}