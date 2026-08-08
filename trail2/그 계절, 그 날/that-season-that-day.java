import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        season(y, m, d);
    }

    public static boolean yoon(int y)
    {
        if (y % 4 == 0)
        {
            if (y % 100 == 0)
            {
                if (y % 400 == 0)
                {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static void season(int y, int m, int d)
    {
        if (m >= 3 && m <= 5 && yoondate(y, m, d))
        {
            System.out.print("Spring");
        } else if (m >= 6 && m <= 8 && yoondate(y, m, d))
        {
            System.out.print("Summer");
        } else if (m >= 9 && m <= 11 && yoondate(y, m, d))
        {
            System.out.print("Fall");
        } else if ((m >= 12 || m <= 2 ) && yoondate(y, m, d))
        {
            System.out.print("Winter");
        } else
        {
            System.out.print(-1);
        }
    }

    public static boolean yoondate(int y, int m, int d)
    {
        if (yoon(y))
        {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
            {
                if (d <= 31)
                {
                    return true;
                }
            } else if (m == 2)
            {
                if (d <= 29)
                {
                    return true;
                }
            } else
            {
                if ( d <= 30)
                {
                    return true;
                }
            }
            return false;
        } else {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
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
                if ( d <= 30)
                {
                    return true;
                }
            }
            return false;
        }
    }
}