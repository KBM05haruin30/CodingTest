import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // Please write your code here.
        int[] arr = new int[a.length()];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = a.charAt(i) - '0';
        }

        int max_val = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Math.abs(arr[i] - 1);
            int two = 1;
            int num = 0;
            for (int j = arr.length - 1; j >= 0; j--)
            {
                num += two * arr[j];
                two *= 2;
            }
            arr[i] = Math.abs(arr[i]-1);
            if (max_val < num)
            {
                max_val = num;
            }
        }
        System.out.print(max_val);
    }
}