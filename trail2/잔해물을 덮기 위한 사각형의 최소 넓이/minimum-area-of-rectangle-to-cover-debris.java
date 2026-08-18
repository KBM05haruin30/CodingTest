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

        int min_x = Integer.MAX_VALUE;
        int max_x = Integer.MIN_VALUE;
        int min_y = Integer.MAX_VALUE;
        int max_y = Integer.MIN_VALUE;
        for (int i = 0; i < square.length; i++)
        {
            for (int j = 0; j < square[0].length; j++)
            {
                if (square[i][j] == 1)
                {
                    if (min_x > i)
                    {
                        min_x = i;
                    }
                    if (max_x < i)
                    {
                        max_x = i;
                    }
                    if (min_y > j)
                    {
                        min_y = j;
                    }
                    if (max_y < j)
                    {
                        max_y = j;
                    }
                }
            }
        }
        if (min_x == Integer.MAX_VALUE && max_x == Integer.MIN_VALUE && min_y == Integer.MAX_VALUE && max_y == Integer.MIN_VALUE)
        {
            System.out.print(0);
        } else
        {
            System.out.print((max_x-min_x+1)*(max_y-min_y+1));
        }
    }
}