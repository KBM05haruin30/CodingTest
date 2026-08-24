import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int max_val = Integer.MIN_VALUE;
        for (int i = 0; i < n-2; i++)
        {
            for (int j = i+1; j < n-1; j++)
            {
                for (int k = j+1; k < n; k++)
                {
                    if (arr[i] != arr[j] && arr[j] != arr[k])
                    {
                        if(!isCarry(arr[i], arr[j], arr[k]))
                        {
                            int sum = arr[i] + arr[j] + arr[k];
                            if (sum > max_val)
                            {
                                max_val = sum;
                            }
                        }
                    }
                }
            }
        }
        if (max_val == Integer.MIN_VALUE)
        {
            System.out.print(-1);
        } else
        {
            System.out.print(max_val);   
        }
    }

    public static boolean isCarry(int a, int b, int c)
    {
        int max_val = Math.max(Math.max(a, b), c);
        int divNum = 10;
        while(max_val > 0)
        {
            int a_rest = a % divNum;
            int b_rest = b % divNum;
            int c_rest = c % divNum;
            if (a_rest + b_rest + c_rest >= 10)
            {
                return true;
            }
            a = a / divNum;
            b = b / divNum;
            c = c / divNum;
            max_val /= divNum;
        }
        return false;
    }
}