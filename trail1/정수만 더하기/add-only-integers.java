import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int sum = 0;
        for (int i = 0; i < A.length(); i++)
        {
            if (A.charAt(i) >= '0' && A.charAt(i) <= '9')
            {
                sum += (int)(A.charAt(i)-'0');
            }
        }
        System.out.print(sum);
    }
}