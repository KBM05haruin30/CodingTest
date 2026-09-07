import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n];
        for (int i = 0; i < n; i++) {
            bombs[i] = sc.nextInt();
        }
        // Please write your code here.
        int max_val = -1;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                int bombsNum = 0;
                if (i == j)
                {
                    continue;
                }
                if (bombs[i] == bombs[j] && Math.abs(i-j) <= k)
                {
                    bombsNum = bombs[i];
                    max_val = Math.max(max_val, bombsNum);
                }
            }
        }
        System.out.println(max_val);
    }
}