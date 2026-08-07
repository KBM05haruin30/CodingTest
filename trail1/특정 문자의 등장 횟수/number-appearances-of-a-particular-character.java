import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ee = "ee";
        int cntee = 0;
        String eb = "eb";
        int cnteb = 0;

        for (int i = 0; i < str.length() - 1; i++)
        {
            if (str.substring(i, i+2).equals(ee))
            {
                cntee++;
            }
            if (str.substring(i, i+2).equals(eb))
            {
                cnteb++;
            }
        }
        System.out.print(cntee + " " + cnteb);
    }
}