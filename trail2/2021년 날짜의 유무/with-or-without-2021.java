import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if (exi(m, d))
        {
            System.out.print("Yes");
        } else
        {
            System.out.print("No");
        }

    }

    public static boolean exi(int m, int d)
    {
        if (m < 1 || m > 12)
        {
            return false;
        }
        else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
        {
            if (d <= 31)
            {
                return true;
            }
        } else if (m == 2)
        {
            if (d <= 28)
            {
                return true;
            }
        } else
        {
            if (d <= 30)
            {
                return true;
            }
        }
        return false;
    }
}