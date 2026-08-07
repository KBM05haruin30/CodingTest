import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int L = s.length();
        System.out.println(s);
        for (int i = 0; i < L; i++)
        {
            s = s.substring(s.length()-1, s.length()) + s.substring(0, s.length()-1);
            System.out.println(s);
        }
    }
}