import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int dir = 3;
        int nx = 0; int ny = 0;
        for (int i = 0; i < s.length(); i++)
        {   
            if (s.charAt(i) == 'L')
            {
                dir = (dir - 1 + 4) % 4;
            } else if (s.charAt(i) == 'R')
            {
                dir = (dir + 1) % 4;
            } else if (s.charAt(i) == 'F')
            {
                nx += dx[dir];
                ny += dy[dir];
            }
        }
        System.out.print(nx + " " + ny);
        // Please write your code here.
    }
}