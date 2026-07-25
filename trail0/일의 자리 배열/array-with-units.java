import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[10];
        arr[0] = f;
        arr[1] = s;
        for (int i = 2; i < arr.length; i++)
        {
            arr[i] = (arr[i-2] + arr[i-1]) % 10;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}