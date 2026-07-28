import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        asd(n, m);
    }

    private static void asd(int n, int m)
    {
        int answ = 0;
        int max_value;
        if (n > m)
            max_value = n;
        else
            max_value = m;

        while(true)
        {
            if (max_value % n == 0 && max_value % m == 0)
            {
                answ = max_value;
                break;
            }
            max_value++;
        }
        System.out.print(answ);
    }
}