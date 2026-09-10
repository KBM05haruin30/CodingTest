import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        // Please write your code here.
        int cnt = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                for (int k = j + 1; k < n; k++)
                {
                    int[] arr = new int[101];
                    boolean isNotOver = true;
                    for (int x = 0; x < n; x++)
                    {
                        if (x == i || x == j || x == k)
                        {
                            continue;
                        }
                        for (int y = a[x]; y <= b[x]; y++)
                        {
                            arr[y]++;
                        }
                    }
                    for (int x = 0; x < arr.length; x++)
                    {
                        if (arr[x] > 1)
                        {
                            isNotOver = false;
                            break;
                        }
                    }

                    if (isNotOver)
                    {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}