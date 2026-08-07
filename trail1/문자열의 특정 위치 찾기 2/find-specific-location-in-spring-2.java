import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        String[] str = {"apple", "banana", "grape", "blueberry", "orange"};
        int cnt = 0;
        for (int i = 0; i < str.length; i++)
        {
            if (str[i].charAt(2) == c || str[i].charAt(3) == c)
            {
                cnt++;
                System.out.println(str[i]);
            }
        }
        System.out.print(cnt);
    }
}