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


        int idx = N;
        while(idx >= 1)
        {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++)
            {
                if (arr[i] > max)
                {
                    max = arr[i];
                    idx = i;
                }
            }
            N = idx;
            System.out.print((idx+1) + " ");
        }
    }
}