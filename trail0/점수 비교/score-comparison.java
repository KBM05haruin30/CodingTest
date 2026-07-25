import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A_M = sc.nextInt();
        int A_E = sc.nextInt();
        int B_M = sc.nextInt();
        int B_E = sc.nextInt();
        if (A_M > B_M && A_E > B_E)
            System.out.print(1);
        else
            System.out.print(0);
    }
}