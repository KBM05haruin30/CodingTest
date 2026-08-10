import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        if (palindrome(input))
        {
            System.out.print("Yes");
        } else
        {
            System.out.print("No");
        }
    }

    public static boolean palindrome(String s)
    {
        for (int i = 0; i < s.length()/2; i++)
        {
            if (s.charAt(i) != s.charAt(s.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}