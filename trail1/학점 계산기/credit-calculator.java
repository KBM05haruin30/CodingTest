import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];
        double sum = 0;
        for (int i = 0; i < N; i++)
        {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        double avg = sum/N;
        System.out.printf("%.1f\n", avg);
        if (avg >= 4.0)
        {
            System.out.print("Perfect");
        } else if (avg >= 3.0)
        {
            System.out.print("Good");
        } else
        {
            System.out.print("Poor");
        }
    }
}