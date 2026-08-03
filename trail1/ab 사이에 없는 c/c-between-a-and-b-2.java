import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean s = true;
        for(int i = a; i <= b; i++)
        {
            if (i % c == 0)
            {
                s = false;
            }
        }
        if (s == true)
        {
            System.out.print("YES");
        } else
        {
            System.out.print("NO");
        }
    }
}