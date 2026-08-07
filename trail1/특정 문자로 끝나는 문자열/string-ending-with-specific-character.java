import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] s = new String[10];
        for (int i = 0; i < 10; i++)
        {
            s[i] = sc.next();
        }
        char c = sc.next().charAt(0);
        boolean no = false;
        for (int i = 0; i < 10; i++)
        {
            if (s[i].charAt(s[i].length()-1) == c)
            {
                System.out.println(s[i]);
                no = true;
            }
        }
        if (no == false)
        {
            System.out.println("None");
        }
    }
}