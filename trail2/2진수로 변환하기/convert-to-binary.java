import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[] binary = new int[20];

        while(true)
        {
            if (n < 2)
            {
                binary[cnt++] = n;
                break;
            }

            binary[cnt++] = n % 2;
            n /= 2;
        }
        
        for (int i = cnt-1; i >= 0; i--)
        {
            System.out.print(binary[i]);
        }
    }
}