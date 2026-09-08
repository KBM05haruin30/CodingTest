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
            
            String s = i + "";
            int sum = 0;
            for (int j = 0; j < s.length(); j++)
            {
                int k = s.charAt(j) - '0';
                sum += k;
            }
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }
}