import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s1sub = s1.substring(0, 2);
        String s2sub = s2.substring(2, s2.length());
        System.out.print(s1sub + s2sub);
    }
}