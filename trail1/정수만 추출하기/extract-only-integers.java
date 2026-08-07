import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int sum = 0;
        String s = "";
        for (int i = 0; i < s1.length(); i++)
        {
            if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
            {
                s += s1.charAt(i);
            }
            else
            {
                break;
            }
        }
        sum += Integer.parseInt(s);
        s = "";
        for (int i = 0; i < s2.length(); i++)
        {
            if (s2.charAt(i) >= '0' && s2.charAt(i) <= '9')
            {
                s += s2.charAt(i);
            }
            else
            {
                break;
            }
        }
        sum += Integer.parseInt(s);
        System.out.print(sum);
    }
}