import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] students = new int[n];
        int[] penalizedPerson = new int[m];
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
        }

        int ans = -1;
        for (int i = 0; i < m; i++)
        {
            int penalizedStudent = penalizedPerson[i]-1;
            students[penalizedStudent]++;
            if (students[penalizedStudent] >= k)
            {
                ans = penalizedStudent+1;
                break;
            }
        }
        System.out.print(ans);
        // Please write your code here.
    }
}