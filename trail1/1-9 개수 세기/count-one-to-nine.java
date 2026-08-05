import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            int num = sc.nextInt();
            arr[num]++;
        }
        for (int i = 1; i < 10; i++)
        {
            System.out.println(arr[i]);
        }
    }
}