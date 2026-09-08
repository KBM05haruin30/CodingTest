import java.util.Scanner;

public class Main {

    public static int[] nums = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for (int i = x; i <= y; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                nums[j] = 0;
            }
            int jari = getJari(i);
            getDigitNum(i);
            for (int j = 0; j < 10; j++)
            {
                if (nums[j] == jari-1)
                {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }

    public static int getJari(int n)
    {
        if (n < 10)
        {
            return 1;
        } else
        {
            return getJari(n / 10) + getJari(n % 10);
        }
    }

    public static void getDigitNum(int n)
    {
        if (n < 10)
        {
            nums[n]++;
        } else
        {
            getDigitNum(n / 10);
            getDigitNum(n % 10);
        }
    }
}