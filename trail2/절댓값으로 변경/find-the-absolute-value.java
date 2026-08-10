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
        cal(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void cal(int[] arr2)
    {
        for (int i = 0; i < arr2.length; i++)
        {
            if (arr2[i] < 0)
            {
                arr2[i] *= -1;
            }
        }
    }
}