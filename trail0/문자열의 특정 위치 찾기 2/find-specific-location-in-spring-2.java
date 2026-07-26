import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] str = {"apple", "banana", "grape", "blueberry", "orange"};
        char c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < 5; i++)
        {
            if (str[i].charAt(2) == c || str[i].charAt(3) == c)
            {
                System.out.println(str[i]);
                count++;
            }
        }
        System.out.print(count);
    }
}