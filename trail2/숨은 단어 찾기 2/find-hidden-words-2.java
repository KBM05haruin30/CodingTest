import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        // Please write your code here.
        int[] dx = {0, 1, 1, -1};
        int[] dy = {1, 0, 1, 1};
        int cnt = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (arr[i].charAt(j) == 'E' || arr[i].charAt(j) == 'L')
                {
                    for (int k = 0; k < 4; k++)
                    {
                        String s ="";
                        for (int step = 0; step < 3; step++)
                        {
                            int nx = i + dx[k] * step;
                            int ny = j + dy[k] * step;

                            if (inRange(nx, ny, n, m) && ((arr[nx].charAt(ny) == 'E' || arr[nx].charAt(ny) == 'L')))
                            {
                                s += arr[nx].charAt(ny);
                            } else
                            {
                                break;
                            }
                        }
                        if (s.equals("LEE") || s.equals("EEL"))
                        {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    public static boolean inRange(int x, int y, int n, int m)
    {
        if (0 <= x && x < n && 0 <= y && y < m)
        {
            return true;
        }
        return false;
    }
}