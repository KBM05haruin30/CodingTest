import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(add(N));
    }

    public static int add(int num)
    {
        int sum = 0;
        for (int i = 1; i <=num; i++)
        {
            sum += i;
        }
        return sum / 10;
    }
}