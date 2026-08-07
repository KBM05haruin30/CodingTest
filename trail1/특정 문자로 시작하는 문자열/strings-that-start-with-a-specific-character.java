import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];
        for (int i = 0; i < N; i++)
        {
            str[i] = sc.next();
        }
        char c = sc.next().charAt(0);

        int cnt = 0;
        double sum = 0;
        for (int i = 0; i < N; i++)
        {
            if (str[i].charAt(0) == c)
            {
                cnt++;
                sum += str[i].length();
            }
        }
        System.out.printf("%d %.2f", cnt, sum/cnt);

    }
}