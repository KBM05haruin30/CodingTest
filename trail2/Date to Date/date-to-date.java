import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int[] days_month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int start = 0;
        int end = 0;
        for (int i = 1; i <= m1; i++)
        {
            if (i == m1)
            {
                start += d1;
            }else{
                start += days_month[i];
            }
        }

        for (int i = 1; i <= m2; i++)
        {
            if (i == m2)
            {
                end += d2;
            }else{
                end += days_month[i];
            }
        }

        System.out.println(end - start+1);
    }
}