import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while (s.length() > 1)
        {
            int n = sc.nextInt();
            if (n >= s.length()-1)
            {
                n = s.length()-1;
            }
            if (n == 0)
            {
                s = s.substring(1, s.length());
            } 
            else if (n == s.length()-1)
            {
                s = s.substring(0, n);
            }
            else
            {
                s = s.substring(0, n) + s.substring(n + 1, s.length());
            }
            System.out.println(s);
        }
    }
}