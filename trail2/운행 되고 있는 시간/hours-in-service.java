import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        // Please write your code here.
        int max_time = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++)
        {
            int[] timeTable = new int[1001];
            for (int j = 0; j < N; j++)
            {
                if (j == i)
                {
                    continue;
                }
                for (int k = A[j]; k < B[j]; k++)
                {
                    timeTable[k] = 1;
                }
            }
            int sum_time = 0;
            for (int j = 0; j < timeTable.length; j++)
            {
                sum_time += timeTable[j];
            }
            max_time = Math.max(max_time, sum_time);
        }
        System.out.println(max_time);
    }
}