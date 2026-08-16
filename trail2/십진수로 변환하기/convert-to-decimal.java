import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int num = 0;
        char[] c = binary.toCharArray();

        for (int i = 0; i < c.length; i++)
        {
            num = num * 2 + c[i] - '0';
        }
        System.out.print(num);
    }
}