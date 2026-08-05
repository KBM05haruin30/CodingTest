import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[10];
        for (int i = 1; i <= 10; i++)
        {
            arr[i-1] = sc.next().charAt(0);
            if (i == 2 || i == 5 || i == 8)
            {
                System.out.print(arr[i-1] + " ");
            }
        }
    }
}