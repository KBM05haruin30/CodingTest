import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 0;
        for (int i = A; i <= B; i++)
        {
            if (isMagicNum(i))
            {
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static boolean isMagicNum(int i)
    {
        if (i % 2 == 0)
        {
            return false;
        }
        if (i % 10 == 5)
        {
            return false;
        }
        if (i % 3 == 0 && i % 9 != 0)
        {
            return false;
        }
        return true;
    }
}