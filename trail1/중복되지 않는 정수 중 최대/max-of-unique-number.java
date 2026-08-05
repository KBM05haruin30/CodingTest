import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[1001];
        for (int i = 1; i <= N; i++)
        {
            int num = sc.nextInt();
            arr[num]++;
        }
        int max = -1;
        for (int i = 1; i <= 1000; i++)
        {
            if (arr[i] == 1)
            {
                if (max < i)
                {
                    max = i;
                }
            } else
            {
                continue;
            }
        }
        System.out.print(max);
    }
}