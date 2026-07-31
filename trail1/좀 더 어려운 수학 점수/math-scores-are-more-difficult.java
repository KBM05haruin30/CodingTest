import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A_math = sc.nextInt();
        int A_eng = sc.nextInt();
        int B_math = sc.nextInt();
        int B_eng = sc.nextInt();
        if (A_math > B_math)
        {
            System.out.print("A");
        } else if (A_math < B_math)
        {
            System.out.print("B");
        } else
        {
            System.out.print(A_eng>B_eng?"A":"B");
        }
    }
}