import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.

        int ans = 0;
        for (int i = x; i <= y; i++)
        {
            String num = i + "";
            boolean isPelindrom = true;
            for (int j = 0; j < num.length()/2; j++)
            {
                if (num.charAt(j) != num.charAt(num.length()-j-1))
                {
                    isPelindrom = false;
                }
            }
            if (isPelindrom)
            {
                ans++;
            }
        }
        System.out.println(ans);
    }
}