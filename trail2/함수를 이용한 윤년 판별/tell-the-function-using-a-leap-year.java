import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (year4(y))
        {
            System.out.print("true");
        } else
        {
            System.out.print("false");
        }
    }

    public static boolean year4(int year)
    {
        if (year % 4 == 0)
        {
            if (year % 100 == 0 && year % 400 != 00)
            {
                return false;
            }
            return true;
        }
        return false;
    }
}