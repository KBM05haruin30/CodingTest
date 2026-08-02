import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int i = 1;
        while (i <= N)
        {
            if ((i % 4 == 0) && !(i%100 == 0 && i % 400 != 0))
            {
                cnt++;
            }
            i++;
        }
        System.out.print(cnt);
    }
}