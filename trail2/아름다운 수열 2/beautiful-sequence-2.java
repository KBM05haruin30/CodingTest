import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = sc.nextInt();
        // Please write your code here.

        int[] tmp = new int[M];
        Arrays.sort(B);

        int cnt = 0;
        for (int i = 0; i <= N - M; i++)
        {
            for (int j = 0; j < M; j++)
            {
                tmp[j] = A[i+j];
            }
            Arrays.sort(tmp);

            boolean isSame =true;
            for (int j = 0; j < M; j++)
            {
                if (tmp[j] != B[j])
                {
                    isSame = false;
                    break;
                }
            }
            if (isSame)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}