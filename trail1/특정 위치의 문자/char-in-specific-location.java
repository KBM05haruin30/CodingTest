import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] c = {'L', 'E', 'B', 'R', 'O', 'S'};
        char ic = sc.next().charAt(0);
        int idx = -1;
        for (int i = 0; i < 6; i++)
        {
            if (ic == c[i])
            {
                idx = i;
            }
        }
        if (idx == -1)
        {
            System.out.print("None");
        } else
        {
            System.out.print(idx);
        }
    }
}