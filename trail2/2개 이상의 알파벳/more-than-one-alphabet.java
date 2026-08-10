import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        if (dif(A))
        {
            System.out.print("Yes");
        } else
        {
            System.out.print("No");
        }
    }

    public static boolean dif(String A)
    {
        int cnt = 0;
        char f = A.charAt(0);
        for (int i = 1; i < A.length(); i++)
        {
            if (f != A.charAt(i))
            {
                cnt++;
            }
        }
        if (cnt > 0)
        {
            return true;
        } else
        {
            return false;
        }
    }
}