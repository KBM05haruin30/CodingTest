import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String s = Integer.toString(A + B);
        int cnt = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '1')
            {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}