import java.util.Scanner;
public class Main {

    public static int idx = -1;
    public static void cal(String text, String pattern)
    {
        for (int i = 0; i < text.length()-pattern.length() + 1; i++)
        {
            if (text.substring(i, pattern.length()+i).equals(pattern))
            {
                idx = i;
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.
        cal(text, pattern);
        System.out.print(idx);
    }
}