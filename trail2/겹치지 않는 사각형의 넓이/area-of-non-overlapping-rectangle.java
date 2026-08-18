import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] square = new int[2000][2000];
        int offset = 1000;
        int ax1 = sc.nextInt()+offset;
        int ay1 = sc.nextInt()+offset;
        int ax2 = sc.nextInt()+offset;
        int ay2 = sc.nextInt()+offset;
        int bx1 = sc.nextInt()+offset;
        int by1 = sc.nextInt()+offset;
        int bx2 = sc.nextInt()+offset;
        int by2 = sc.nextInt()+offset;
        int mx1 = sc.nextInt()+offset;
        int my1 = sc.nextInt()+offset;
        int mx2 = sc.nextInt()+offset;
        int my2 = sc.nextInt()+offset;
        int row_min = Math.min(Math.min(ax1, bx1), mx1);
        int row_max = Math.max(Math.max(ax2, bx2), mx2);
        int column_min = Math.min(Math.min(ay1, by1), my1);
        int column_max = Math.max(Math.max(ay2, by2), my2);

        for (int i = ax1; i < ax2; i++)
        {
            for (int j = ay1; j < ay2; j++)
            {
                square[i][j] = 1;
            }
        }

        for (int i = bx1; i < bx2; i++)
        {
            for (int j = by1; j < by2; j++)
            {
                square[i][j] = 2;
            }
        }

        for (int i = mx1; i < mx2; i++)
        {
            for (int j = my1; j < my2; j++)
            {
                square[i][j] = 0;
            }
        }

        int cnt = 0;
        for (int i = row_min; i < row_max; i++)
        {
            for (int j = column_min; j< column_max; j++)
            {
                if (square[i][j] > 0)
                {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
        // Please write your code here.
    }
}