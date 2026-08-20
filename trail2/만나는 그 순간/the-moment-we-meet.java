import java.util.Scanner;

public class Main {
    public static char[] d = new char[1000];
    public static int[] t = new int[1000];
    public static char[] d2 = new char[1000];
    public static int[] t2 = new int[1000];

    public static int[] a = new int[1000001];
    public static int[] b = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int total = 0;
        int a_pos = 0;
        int a_idx = 1;
        for (int i = 0; i < n; i++) {
            d[i] = sc.next().charAt(0);
            t[i] = sc.nextInt();
            total += t[i];
            for (int j = 0; j < t[i]; j++)
            {
                if (d[i] == 'L')
                {
                    a[a_idx++] = --a_pos;
                } else if (d[i] == 'R')
                {
                    a[a_idx++] = ++a_pos;
                }
            }
        }

        int b_pos = 0;
        int b_idx = 1;
        for (int i = 0; i < m; i++) {
            d2[i] = sc.next().charAt(0);
            t2[i] = sc.nextInt();
            for (int j = 0; j < t2[i]; j++)
            {
                if (d2[i] == 'L')
                {
                    b[b_idx++] = --b_pos;
                } else if (d2[i] == 'R')
                {
                    b[b_idx++] = ++b_pos;
                }
            }
        }

        int meet = 0;
        for (int i = 1; i <= total; i++)
        {
            if (a[i] == b[i])
            {
                meet = i;
                break;
            }
        }
        if (meet != 0)
        {
            System.out.println(meet);
        } else
        {
            System.out.println(-1);
        }

        // Please write your code here.
    }
}