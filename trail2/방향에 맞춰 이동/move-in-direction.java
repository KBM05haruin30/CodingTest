import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};

        int x = 0; int y = 0;
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please write your code here.
            int idx = -1;
            if (direction == 'W')
            {
                idx = 0;
            } else if (direction == 'S')
            {
                idx = 1;
            } else if (direction == 'N')
            {
                idx = 2;
            } else if (direction == 'E')
            {
                idx = 3;
            }
            x += dx[idx]*distance;
            y += dy[idx]*distance;
        }

        System.out.print(x + " " + y);
    }
}