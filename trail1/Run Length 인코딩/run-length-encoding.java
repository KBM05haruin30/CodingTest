import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char c = A.charAt(0);
        int cnt = 1;
        String str = "";
        for (int i = 1; i < A.length(); i++)
        {
            if (c != A.charAt(i))
            {
                str = str + c + cnt;
                c = A.charAt(i);
                cnt = 1;
            } else
            {
                cnt++;
            }
        }
        str = str + c + cnt;
        System.out.println(str.length());
        System.out.print(str);
    }
}