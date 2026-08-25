import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        // Please write your code here.
        int max_val = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n-2; j++)
            {
                for (int x = i; x < n; x++)
                {
                    for (int y = 0; y < n-2; y++)
                    {
                        if (!covered(i, j, x, y))
                        {
                            int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[x][y] + arr[x][y+1] + arr[x][y+2];
                            if (sum > max_val)
                            {
                                max_val = sum;
                            }
                        }

                    }
                }
            }
        }
        System.out.print(max_val);
    }
    public static boolean covered(int x1, int y1, int x2, int y2)
    {
        if ((x1 == x2 && (y1 == y2 || y1 + 1 == y2|| y1 + 2 == y2 || y1 == y2 + 1 || y1 == y2 + 2)))
        {
            return true;
        }
        return false;
    }
}