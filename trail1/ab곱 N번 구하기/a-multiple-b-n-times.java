import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int prob = 1;
            for (int j = a; j <= b; j++)
            {
                prob *= j;
            }
            System.out.println(prob);
        }
    }
}