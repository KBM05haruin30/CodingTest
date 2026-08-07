import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        boolean po = false;
        int cnt = 0;
        String A = sc.next();
        String B = sc.next();
        for (int i = 0; i < A.length(); i++)
        {
            A = A.charAt(A.length()-1) + A.substring(0, A.length()-1);
            cnt++;
            if (A.equals(B))
            {
                po = true;
                break;
            }
        }
        if (po)
        {
            System.out.print(cnt);
        } else
        {
            System.out.print(-1);
        }
    }
}