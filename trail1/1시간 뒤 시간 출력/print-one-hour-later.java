import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sarr = s.split(":");
        System.out.print((Integer.parseInt(sarr[0])+1) + ":" + sarr[1]);
    }
}