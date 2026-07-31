import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 3; i++)
        {
            char c = sc.next().charAt(0);
            int deg = sc.nextInt();
            if (c == 'Y' && deg >= 37)
            {
                count++;
            }
        }
        if (count >= 2)
        {
            System.out.println("E");
        } else
        {
            System.out.println("N");
        }
    }
}