import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        // Please write your code here.
        int max_score = 0;
        for (int i = 1; i <= 3; i++)
        {
            int score = 0;
            boolean[] isStone = new boolean[4];
            isStone[i] = true;
            for (int j = 0; j < n; j++)
            {
                boolean temp = isStone[a[j]];
                isStone[a[j]] = isStone[b[j]];
                isStone[b[j]] = temp;

                if (isStone[c[j]] == true)
                {
                    score++;
                }
            }
            max_score = Math.max(max_score, score);
        }
        System.out.println(max_score);
    }
}