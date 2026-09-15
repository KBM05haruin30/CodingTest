import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seat = sc.next();
        // Please write your code here.
        int[] seats = new int[n];
        for (int i = 0; i < n; i++)
        {
            seats[i] = seat.charAt(i) - '0';
        }

        int ans = 0;
        for (int i = 0; i < n; i++)
        {
            if(seats[i] == 1)
            {
                continue;
            }

            seats[i] = 1;

            int minDist = Integer.MAX_VALUE;
            int lastIdx = -1;

            for (int j = 0; j < n; j++)
            {
                if (seats[j] == 1)
                {
                    if (lastIdx != -1)
                    {
                        minDist = Math.min(minDist, j - lastIdx);
                    }
                    lastIdx = j;
                }
            }

            ans = Math.max(ans, minDist);


            seats[i] = 0;
        }
        System.out.println(ans);
    }
}