import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++)
        {
            int n = sc.nextInt();
            if (n == 1)
            {
                s = s.substring(1, s.length()) + s.substring(0, 1);
            } else if (n == 2)
            {
                s = s.substring(s.length()-1, s.length()) + s.substring(0, s.length()-1);
            } else if (n == 3)
            {
                char[] arr = s.toCharArray();
                for (int j = 0; j < s.length()/2; j++)
                {
                    char temp = arr[j];
                    arr[j] = arr[s.length()-1-j];
                    arr[s.length()-1-j] = temp;
                    s = String.valueOf(arr);
                }
            }
            System.out.println(s);
        }
    }
}