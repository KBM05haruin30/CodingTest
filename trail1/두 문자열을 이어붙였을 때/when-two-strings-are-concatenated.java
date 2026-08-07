import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        if ((A+B).equals(B+A))
        {
            System.out.print("true");
        } else
        {
            System.out.print("false");
        }
    }
}