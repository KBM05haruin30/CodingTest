import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for (int i = A; i <= B; i++)
        {
            if(isMagicNumber(i))
            {
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static boolean isMagicNumber(int i)
    {
        return i%3==0 || contains369(i);
    }
    public static boolean contains369(int i)
    {
        String s = String.valueOf(i);
        return s.contains("3") || s.contains("6") || s.contains("9");
    }
}