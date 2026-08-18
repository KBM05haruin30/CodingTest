import java.util.Scanner;

public class Main {

    public static final int OFFSET = 1000;
    public static final int MAX_R = 2000;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] square = new int[MAX_R + 1][MAX_R + 1];
        for (int i = 0; i < 2; i++)
        {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int j = x1; j < x2; j++)
            {
                for (int k = y1; k < y2; k++)
                {
                    square[j][k]= i+1;
                }
            }
        }

        int min_x = MAX_R;
        int max_x = 0;
        int min_y = MAX_R;
        int max_y = 0;
        boolean rectExist = false;
        for (int i = 0; i <= MAX_R; i++)
        {
            for (int j = 0; j <= MAX_R; j++)
            {
                if (square[i][j] == 1)
                {
                    rectExist = true;
                    min_x = Math.min(min_x, i);
                    max_x = Math.max(max_x, i);
                    min_y = Math.min(min_y, j);
                    max_y = Math.max(max_y, j);
                }
            }
        }
        if (!rectExist)
        {
            System.out.print(0);
        } else
        {
            System.out.print((max_x-min_x+1)*(max_y-min_y+1));
        }
    }
}