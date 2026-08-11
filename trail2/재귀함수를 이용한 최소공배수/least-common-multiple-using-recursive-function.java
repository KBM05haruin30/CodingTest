import java.util.Scanner;

public class Main {

    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.print(getLCM(0, n));
    }

    public static int gcd(int a, int b)
    {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static int lcm(int a, int b)
    {
        return (a*b)/gcd(a, b);
    }

    public static int getLCM(int idx, int n)
    {
        if (idx == n - 1)
        {
            return arr[idx];
        }
        return lcm(arr[idx], getLCM(idx+1, n));
    }
}