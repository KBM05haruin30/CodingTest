import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 2; i <= 9; i++)
        {
            System.out.print(s.charAt(i));
        }
    }
}