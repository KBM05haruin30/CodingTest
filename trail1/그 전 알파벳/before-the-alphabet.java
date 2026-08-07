import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int cn = (int)c;
        cn--;
        if (cn < (int)'a')
        {
            cn = (int)'z';
        }
        System.out.print((char)cn);
    }
}