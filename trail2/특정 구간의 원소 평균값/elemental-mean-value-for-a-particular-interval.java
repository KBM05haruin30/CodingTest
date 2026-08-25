import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                int sum = 0;
                for (int k = i; k <= j; k++)
                {
                    sum += arr[k];
                }
                int avg = sum / (j-i+1);
                int rest = sum % (j-i+1);
                if (rest != 0)
                {
                    continue;
                }
                for (int k = i; k <= j; k++)
                {
                    if (arr[k] == avg)
                    {
                        cnt++;
                        break;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}