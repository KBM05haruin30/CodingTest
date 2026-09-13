import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp1 = sc.next();
        String inp2 = sc.next();
        String inp3 = sc.next();
        // Please write your code here.

        int[][] b = new int[3][3];
        for (int i = 0; i < 3; i++)
        {
            b[0][i] = inp1.charAt(i) - '0';
            b[1][i] = inp2.charAt(i) - '0';
            b[2][i] = inp3.charAt(i) - '0';
        }

        int cnt = 0;
        for (int i = 1; i <= 9; i++)
        {
            for (int j = i + 1; j <= 9; j++)
            {
                boolean isWin = false;

                for (int r = 0; r < 3; r++)
                {
                    int n1 = b[r][0], n2 = b[r][1], n3 = b[r][2];
                    if ((n1 == i || n1 == j) && (n2 == i || n2 == j) && (n3 == i || n3 == j))
                    {
                        if (!(n1 == n2 && n2 == n3))
                        {
                            isWin = true;
                        }
                    }
                }

                for (int c = 0; c < 3; c++)
                {
                    int n1 = b[0][c], n2 = b[1][c], n3 = b[2][c];
                    if ((n1 == i || n1 == j) && (n2 == i || n2 == j) && (n3 == i || n3 == j))
                    {
                        if (!(n1 == n2 && n2 == n3))
                        {
                            isWin = true;
                        }
                    }
                }

                int n1 = b[0][0], n2 = b[1][1], n3 = b[2][2];
                if ((n1 == i || n1 == j) && (n2 == i || n2 == j) && (n3 == i || n3 == j))
                {
                    if (!(n1 == n2 && n2 == n3))
                    {
                        isWin = true;
                    }
                }
                

                n1 = b[0][2];n2 = b[1][1]; n3 = b[2][0];
                if ((n1 == i || n1 == j) && (n2 == i || n2 == j) && (n3 == i || n3 == j))
                {
                    if (!(n1 == n2 && n2 == n3))
                    {
                        isWin = true;
                    }
                }
               
               if (isWin)
               {
                cnt++;
               }
            }
        }
        System.out.println(cnt);
    }
}