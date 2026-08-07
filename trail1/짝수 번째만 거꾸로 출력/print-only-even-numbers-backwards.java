import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = s.length()-1; i>=0; i--)
        {
            if (i % 2 != 0)
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}