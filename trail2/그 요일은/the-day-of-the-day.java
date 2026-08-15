import java.util.Scanner;

public class Main {

    public static int numsOfDay(int m, int d)
    {
        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDay = 0;

        for (int i = 1; i <m; i++)
        {
            totalDay += days[i]; 
        }

        totalDay += d;

        return totalDay;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int diff = numsOfDay(m2, d2) - numsOfDay(m1, d1);
        int cnt = 0;
        cnt += diff/7;
        for (int i = 0; i <= diff%7; i++)
        {
            if (days[i].equals(A))
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}