import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String S = sc.next();
        for (int i = 0; i < S.length(); i++)
        {
            if (S.charAt(i) == 'L')
            {
                A = A.substring(1, A.length()) + A.substring(0, 1);
            } else if (S.charAt(i) == 'R')
            {
                A = A.substring(A.length()-1, A.length()) + A.substring(0, A.length()-1);
            }
        }
        System.out.print(A);
    }
}