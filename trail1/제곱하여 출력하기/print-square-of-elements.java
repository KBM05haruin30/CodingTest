import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            int num = sc.nextInt();
            System.out.print(num*num + " ");
        }
    }
}