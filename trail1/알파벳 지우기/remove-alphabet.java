import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s1n = "";
        String s2n = "";
        for (int i = 0; i < s1.length(); i++)
        {
            if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
            {
                s1n += s1.charAt(i);
            }
        }

        for (int i = 0; i < s2.length(); i++)
        {
            if (s2.charAt(i) >= '0' && s2.charAt(i) <= '9')
            {
                s2n += s2.charAt(i);
            }
        }
        System.out.print(Integer.parseInt(s1n) + Integer.parseInt(s2n));
    }
}