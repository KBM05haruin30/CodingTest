import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++)
        {
            sum += sc.nextInt();
        }
        String s = Integer.toString(sum);
        System.out.print(s.substring(1, s.length()) + s.substring(0, 1));
    }
}