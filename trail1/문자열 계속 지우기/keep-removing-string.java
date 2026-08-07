import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int i = 0;
        while(true)
        {
            i = A.indexOf(B);
            if (i == -1)
            {
                break;
            }
            A = A.substring(0, i) + A.substring(i + B.length());
        }
        System.out.print(A);
    }
}