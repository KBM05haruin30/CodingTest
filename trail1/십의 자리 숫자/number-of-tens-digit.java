import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 100; i++)
        {
            int num = sc.nextInt();
            if (num == 0)
            {
                break;
            }
            arr[num/10]++;
        }
        for (int i = 1; i < 10; i++)
        {
            System.out.println(i + " - " + arr[i]);
        }
    }
}