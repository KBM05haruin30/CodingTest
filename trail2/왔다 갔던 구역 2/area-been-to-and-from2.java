import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[2000];
        int pos = 1000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'L')
            {
                x = pos - x;
                for (int j = x; j < pos; j++)
                {
                    arr[j]++;
                }
                pos = x;
            } else if (dir == 'R')
            {
                x = pos + x;
                for (int j = pos; j < x; j++)
                {
                    arr[j]++;
                }
                pos = x;
            }
            // Please write your code here.
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 2)
            {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}