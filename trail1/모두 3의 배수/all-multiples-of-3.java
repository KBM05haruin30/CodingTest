import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        boolean prod3 = false;
        for(int i = 0; i < 5; i++)
        {
            int n = sc.nextInt();
            if (n % 3 != 0)
            {
                prod3 = true;
            }
        }
        if (prod3 == true)
        {
            System.out.print(0);
        } else
        {
            System.out.print(1);
        }
    }
}