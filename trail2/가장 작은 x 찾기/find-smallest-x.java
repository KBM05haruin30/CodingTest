import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        // Please write your code here.
        for (int i = 1; i <= 10000; i++)
        {
            int x = i;
            int cnt = 2;
            boolean isTrue = true;
            for (int j = 0; j < n; j++)
            {
                x = x * cnt;

                if (a[j] <= x && x <= b[j])
                {
                    continue;
                } else
                {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue)
            {
                System.out.println(i);
                break;
            }
        }
    }
}