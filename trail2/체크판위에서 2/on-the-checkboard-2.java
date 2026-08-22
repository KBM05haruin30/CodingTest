import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        // Please write your code here.
        int cnt = 0;
        int x1 = 0;
        int y1 = 0;
        char first = grid[x1][y1];
        for (int x2 = x1+1; x2 < R-2; x2++)
        {
            for (int y2 = y1+1; y2 < C-2; y2++)
            {
                for (int x3 = x2+1; x3 < R-1; x3++)
                {
                    for (int y3 = y2+1; y3 < C-1; y3++)
                    {
                       if (first != grid[x2][y2] && grid[x2][y2] != grid[x3][y3] && grid[x3][y3] != grid[R-1][C-1])
                        {
                            cnt++;
                        }
                    }
                }
            }
        }
        
        System.out.print(cnt);
    }
}