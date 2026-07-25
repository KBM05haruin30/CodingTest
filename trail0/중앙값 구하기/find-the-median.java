import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A > B && B > C)
            System.out.print(B);
        else if (A > B && B < C)
        {
            if (A > C)
                System.out.print(C);
            else if (C > A)
                System.out.print(A);
        }
        else if (B > C && C > A)
            System.out.print(C);
        else if (B > C && A > C)
        {
            if (B > A)
                System.out.print(A);
            else if (B < A)
                System.out.print(B);
        }
        else if (C > A && A > B)
            System.out.print(A);
        else if (C > A && A < B)
        {
            if (C > B)
                System.out.print(B);
            else if (C < B)
                System.out.print(C);
        }

    }
}