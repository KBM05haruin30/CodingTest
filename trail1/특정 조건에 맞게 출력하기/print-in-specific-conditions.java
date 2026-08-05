import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++)
        {
            int num = sc.nextInt();
            if (num == 0)
            {
                break;
            } else if (num % 2 == 0)
            {
                System.out.print((num / 2) + " ");
            } else if (num % 2 != 0)
            {
                System.out.print((num+3) + " ");
            }
        }
    }
}