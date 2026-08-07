import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        if (n > s.length())
        {
            n = s.length();
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(s.charAt(s.length()-1-i));
        }
    }
}