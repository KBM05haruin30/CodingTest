import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        String[] containT = new String[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        for (int i = 0; i < n; i++)
        {
            if (words[i].contains(t))
            {
                if (words[i].substring(0, t.length()).equals(t))
                {
                    containT[cnt] = words[i];
                    cnt++;
                }
            }
        }
        Arrays.sort(containT, 0, cnt);
        System.out.print(containT[k-1]);

    }
}