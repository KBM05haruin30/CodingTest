import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int idx = s.indexOf('e');
        System.out.print(s.substring(0, idx) + s.substring(idx+1, s.length()));
    }
}