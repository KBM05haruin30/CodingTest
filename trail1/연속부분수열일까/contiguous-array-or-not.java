import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int[] A = new int[N1];
        int[] B = new int [N2];
        if (N1 < N2)
        {
            System.out.print("No");
            return;
        }
        for (int i = 0; i < N1; i++)
        {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N2; i++)
        {
            B[i] = sc.nextInt();
        }

        boolean b = false;
        for (int i = 0; i <= N1-N2; i++)
        {
            if (A[i] == B[0])
            {
                boolean matched = true;
                for (int j = 0; j < N2; j++)
                {
                    if (A[i+j] != B[j])
                    {
                        matched = false;
                        break;
                    }
                }
                if (matched == true)
                {
                    b = true;
                    break;
                }
            }
        }
        if (b == true)
        {
            System.out.print("Yes");
        } else
        {
            System.out.print("No");
        }
    }
}