import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int idx = -1;
        int cnt = 0;
        for(int i = 0; i < N; i++)
        {
            int num = sc.nextInt();
            if (num == 2)
            {
                cnt++;
            }
            if (cnt == 3)
            {
                idx = i+1;
                break;
            }
        }
        System.out.print(idx);
    }
}