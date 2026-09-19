import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seat = sc.next();
        // Please write your code here.

        char[] arr = seat.toCharArray();
        int maxDist = 0;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] == '1') continue;

            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] == '1') continue;

                arr[i] = '1';
                arr[j] = '1';

                int minDist = Integer.MAX_VALUE;
                int last = -1;

                for (int k = 0; k < n; k++)
                {
                    if (arr[k] == '1')
                    {
                        if (last != -1)
                        {
                            minDist = Math.min(minDist, k - last);
                        }
                        last = k;
                    }
                }

                maxDist = Math.max(maxDist, minDist);

                arr[i] = '0';
                arr[j] = '0';
            }
        }
        System.out.println(maxDist);
    }
}