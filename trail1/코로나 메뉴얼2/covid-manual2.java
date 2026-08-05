import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 3; i++)
        {
            char status = sc.next().charAt(0);
            int degree = sc.nextInt();
            if (status == 'Y' && degree >= 37)
            {
                arr[0]++; 
            } else if (status == 'N' && degree >= 37)
            {
                arr[1]++;
            } else if (status == 'Y' && degree < 37)
            {
                arr[2]++;
            } else
            {
                arr[3]++;
            }
        }
        for (int i = 0; i < 4; i++)
        {
            System.out.print(arr[i] + " ");
        }
        if (arr[0] >= 2)
        {
            System.out.print("E");
        }
    }
}