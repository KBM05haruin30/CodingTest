import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String inputs = sc.next();
        String purposes = sc.next();
        int idx = -1;
        for (int i = 0; i < inputs.length() - purposes.length() +1; i++)
        {
            if (inputs.substring(i, i + purposes.length()).equals(purposes))
            {
                idx = i;
                break;
            }
        }
        System.out.print(idx);
    }
}