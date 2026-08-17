import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[200000];
        int pos = 100000;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L')
            {
                x = pos - x + 1;

                for (int j = x; j <= pos; j++)
                {
                    arr[j] = -1;
                }
                pos = x;

            } else if (d == 'R')
            {
                x = pos + x - 1;
                for (int j = pos; j <= x; j++)
                {
                    arr[j] = 1;
                }
                pos = x;
            }
        }
        int white = 0;
        int black = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == -1)
            {
                white++;
            } else if (arr[i] == 1)
            {
                black++;
            }
        }

        System.out.print(white + " " + black);
        // Please write your code here.
    }
}