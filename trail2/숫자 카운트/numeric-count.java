import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] count1 = new int[n];
        int[] count2 = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            count1[i] = sc.nextInt();
            count2[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = 0;
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= 9; j++)
            {
                for (int k = 1; k <= 9; k++)
                {
                    if (i != j && j != k && k != i)
                    {
                        boolean isValid = true;

                        for (int q = 0; q < n; q++)
                        {
                            int target = num[q];
                            int t1 = target/100;
                            int t2 = (target/10) % 10;
                            int t3 = target % 10;

                            int c1 = 0; // 스트라이크
                            int c2 = 0; // 볼

                            if (i == t1) c1++;
                            if (j == t2) c1++;
                            if (k == t3) c1++;

                            if (i == t2 || i == t3) c2++;
                            if (j == t1 || j == t3) c2++;
                            if (k == t1 || k == t2) c2++;

                            if (c1 != count1[q] || c2 != count2[q])
                            {
                                isValid = false;
                                break;
                            }
                        }

                        if (isValid)
                        {
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}