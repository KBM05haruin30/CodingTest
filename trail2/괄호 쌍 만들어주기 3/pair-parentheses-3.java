import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.
        int s_length = str.length();
        int cnt = 0;
        for (int i = 0; i < s_length; i++)
        {
            for (int j = i + 1; j < s_length; j++)
            {
                if (str.charAt(i) == ')')
                {
                    continue;
                } else if (str.charAt(i) == '(')
                {
                    if (str.charAt(j) == ')')
                    {
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}