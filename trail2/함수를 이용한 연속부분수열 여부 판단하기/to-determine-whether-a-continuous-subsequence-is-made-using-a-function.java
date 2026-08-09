import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        if (isSequence(a, b))
        {
            System.out.print("Yes");
        } else
        {
            System.out.print("No");
        }
    }

    public static boolean isSequence(int[] a, int b[])
    {
        boolean isSeq = false;

        if (a.length > b.length)
        {
            for (int i = 0; i < a.length - b.length; i++)
            {
                if (a[i] == b[0])
                {
                    for (int j = 0; j < b.length; j++)
                    {
                        if (a[i+j] != b[j])
                        {
                            isSeq = false;
                            break;
                        } else
                        {
                            isSeq = true;
                        }
                    }
                }
            }

        } else if (a.length == b.length)
        {
            for (int i = 0; i < a.length; i++)
            {
                if (a[i] != b[i])
                {
                    isSeq = false;
                    break;
                } else
                {
                    isSeq = true;
                }
            }
        } else
        {
            isSeq = false;
        }
        return isSeq;
    }
}