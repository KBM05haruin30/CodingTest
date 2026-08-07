import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++)
        {
            int n = sc.nextInt();
            if (n == 1)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                char[] arr = S.toCharArray();
                char temp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = temp;
                S = String.valueOf(arr);
                System.out.println(S);
            } else if (n == 2)
            {
                char x = sc.next().charAt(0);
                char y = sc.next().charAt(0);
                char[] arr = S.toCharArray();
                for (int j = 0; j < arr.length; j++)
                {
                    if (arr[j] == x)
                    {
                        arr[j] = y;
                    }
                }
                S = String.valueOf(arr);
                System.out.println(S);
            }
        }
    }
}