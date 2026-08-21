import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        // Please write your code here.
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int dirNum = 3;
        int x = 0;
        int y = 0;
        int time = 0;
        boolean returnTrue = false;
        for (int i = 0; i < commands.length(); i++)
        {
            char c = commands.charAt(i);
            if (c == 'L')
            {
                dirNum = (dirNum -1 + 4) % 4;
            } else if (c == 'R')
            {
                dirNum = (dirNum + 1) % 4;
            }
            else if (c == 'F')
            {
                x += dx[dirNum];
                y += dy[dirNum];
            }
            time++;

            if (x == 0 && y == 0)
            {
                returnTrue = true;
                break;
            }
        }
        if (returnTrue)
        {
            System.out.print(time);
        } else
        {
            System.out.print(-1);
        }
    }
}