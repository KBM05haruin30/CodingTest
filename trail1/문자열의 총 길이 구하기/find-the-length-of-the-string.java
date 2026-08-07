import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] sa = new String[10];
        int sum = 0;
        for (int i = 0; i < 10; i++)
        {
            sum += sc.next().length();
        }
        System.out.print(sum);
    }
}