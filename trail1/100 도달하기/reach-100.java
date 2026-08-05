import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = N;
        int cnt = 2;
        for (int i = 2; i < 100; i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
            cnt++;
            if (arr[i] > 100)
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