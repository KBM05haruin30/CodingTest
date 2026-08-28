import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ability = new int[6];
        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
        }
        // Please write your code here.
        int min_val = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++)
        {
            for (int j = i + 1; j < 6; j++)
            {
                for (int k = j + 1; k < 6; k++)
                {
                    min_val = Math.min(min_val, getDiff(i, j, k, ability));
                }
            }
        }
        System.out.println(min_val);
    }

    public static int getDiff(int i, int j, int k, int[] ability)
    {
        int sum1 = ability[i] + ability[j] + ability[k];
        int sum2 = 0;
        for (int x = 0; x < 6; x++)
        {
            sum2 += ability[x];
        }
        sum2 -= sum1;
        return Math.abs(sum1 - sum2);
    }
}