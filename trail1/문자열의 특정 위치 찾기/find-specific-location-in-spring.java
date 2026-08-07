import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        if (s.indexOf(c) != -1)
        {
            System.out.print(s.indexOf(c));
        } else
        {
            System.out.print("No");
        }
    }
}