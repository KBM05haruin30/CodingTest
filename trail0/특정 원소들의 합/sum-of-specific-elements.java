import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] color = {
            {1, 0, 0, 0},
            {1, 1, 0, 0},
            {1, 1, 1, 0},
            {1, 1, 1, 1}
        };
        int total = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                int n = sc.nextInt();
                if (color[i][j] == 1)
                {
                    total += n;
                }
            }
        }
        System.out.print(total);
    }
}