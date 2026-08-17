import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 위치 갱신 주의
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[200000];
        int pos = 100000;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L')
            {
                while(x-->0)
                {
                    arr[pos] = -1;
                    if (x > 0)
                    {
                        pos--;
                    }
                }

            } else if (d == 'R')
            {
                while(x-->0)
                {
                    arr[pos] = 1;
                    if (x > 0)
                    {
                        pos++;
                    }
                }
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