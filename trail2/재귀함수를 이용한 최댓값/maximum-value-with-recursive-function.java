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
        System.out.print(max(arr, n));
    }

    public static int max(int[] arr, int n)
    {
        if (n == 1)
        {
            return arr[0];
        }
        int b = max(arr, n-1);

        if (arr[n-1] > b)
        {
            return arr[n-1];
        } else
        {
            return b;
        }

        // return arr[n-1]>max(arr, n-1)?arr[n-1]:max(arr, n-1);
    }
}