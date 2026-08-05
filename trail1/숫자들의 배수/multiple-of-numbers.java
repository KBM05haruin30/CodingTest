import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt5 = 0;
        int cnt = 0;
        int[] arr = new int[90];
        for (int i = 0; i < arr.length; i++)
        {
            int num = N * (i + 1);
            arr[i] = num;
            cnt++;
            if (num % 5 == 0)
            {
                cnt5++;
            }
            if (cnt5 == 2)
            {
                break;
            }
        }
        for (int i = 0; i < cnt; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}