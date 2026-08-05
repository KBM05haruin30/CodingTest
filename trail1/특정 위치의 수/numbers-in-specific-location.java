import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++)
        {
            int num = sc.nextInt();
            if (i == 3 || i == 5 || i == 10)
            {
                sum += num;
            }
        }
        System.out.print(sum);
    }
}