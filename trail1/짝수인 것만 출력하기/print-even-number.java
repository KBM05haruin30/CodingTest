import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int cnt = 0;
        for (int i = 0; i < N; i++)
        {
            int num = sc.nextInt();
            if (num % 2 == 0)
            {
                arr[cnt] = num;
                cnt++;
            }
        }
        for (int i = 0; i < cnt; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}