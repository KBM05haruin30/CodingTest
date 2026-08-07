import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String s = sc.next();
            if (s.equals("END"))
            {
                break;
            }
            char[] arr = s.toCharArray();
            String str = "";
            for (int i = s.length()-1; i >= 0; i--)
            {
                str += arr[i];
            }
            System.out.println(str);
        }
    }
}