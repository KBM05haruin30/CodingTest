import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int max = A>B?A:B;
        int min = A<B?A:B;
        int sum = 0;
        for (int i = min; i <= max; i++)
        {
            if(i % 5 == 0)
            {
                sum+=i;
            }
        }
        System.out.print(sum);
    }
}