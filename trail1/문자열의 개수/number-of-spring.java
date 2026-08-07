import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String str = "";
        while(true)
        {
            String s = sc.next();
            if (s.charAt(0) == '0')
            {
                break;
            }
            cnt++;
            if (cnt % 2 != 0)
            {
                str += s + "\n";
            }
        }
        System.out.println(cnt);
        System.out.print(str);
    }
}