import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] arr = new int[N+1];
        for (int i = 1; i <= N; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++)
        {
            int q1 = sc.nextInt();
            if (q1 == 1)
            {
                int q2 = sc.nextInt();
                System.out.println(arr[q2]);
            } else if (q1 == 2)
            {
                int idx = -1;
                int q2 = sc.nextInt();
                for (int j = 1; j <= N; j++)
                {
                    if (q2 == arr[j])
                    {
                        idx = j;
                        break;
                    }
                }
                if (idx == -1)
                {
                    System.out.println(0);
                } else
                {
                    System.out.println(idx);
                }
            } else if (q1 == 3)
            {
                int q2 = sc.nextInt();
                int q3 = sc.nextInt();
                for (int j = q2; j <= q3; j++)
                {
                    System.out.print(arr[j] + " ");
                    if (j == q3)
                    {
                        System.out.println();
                    }
                }
            }
        }
    }
}