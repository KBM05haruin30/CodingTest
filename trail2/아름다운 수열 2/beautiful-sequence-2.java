import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] num = new int[101];
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
        {
            B[i] = sc.nextInt();
            num[B[i]]++;
        }
        // Please write your code here.
        int ans = 0;
        for (int i = 0; i < N-M+1; i++)
        {
            int cnt = 0;
            int[] num2 = new int[101];
            for (int j = i; j < M+i; j++)
            {
                num2[A[j]]++;
            }
            for (int j = 1; j < 101; j++)
            {
                if (num[j] == num2[j])
                {
                    cnt++;
                }
            }
            if (cnt == 100)
            {
                ans++;
            }
        }
        System.out.println(ans);
        
    }
}