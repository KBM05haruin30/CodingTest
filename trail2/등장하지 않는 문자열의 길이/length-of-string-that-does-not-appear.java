import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        // Please write your code here.
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
        {
            String[] arr = new String[n];
            for (int j = 0; j < n; j++)
            {
                arr[j] = "";
            }

            int cntTotal = 0;
            int cntNotSame = 0;
            for (int j = 0; j < n-i; j++)
            {
                String s = str.substring(j, j + i+1);
                cntTotal++;
                boolean isSame = false;
                for (int k = 0; k < n; k++)
                {
                    if (arr[k].equals(s))
                    {
                        isSame = true;
                        break;
                    }
                }
                if (!isSame)
                {
                    cntNotSame++;
                    arr[j] = s;
                }
            }

            if (cntTotal == cntNotSame)
            {
                ans = Math.min(ans, i+1);
            }
        }
        System.out.println(ans);
    }
}