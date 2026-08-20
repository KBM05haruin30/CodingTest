import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] A = new int[2000001];
        int[] B = new int[2000001];
        
        int timeA = 1;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            while(t-- > 0)
            {
                if (d == 'L')
                {
                    A[timeA] = A[timeA-1] - 1;
                } else if (d == 'R')
                {
                    A[timeA] = A[timeA -1] + 1;
                }
                timeA++;
            }
            
        }
        

        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            while(t-- > 0)
            {
                if (d == 'L')
                {
                    B[timeB] = B[timeB - 1] - 1;
                } else if (d == 'R')
                {
                    B[timeB] = B[timeB - 1] + 1;
                }
                timeB++;
            }
        }
        int maxT = 0;
        if (timeA > timeB)
        {
            maxT = timeA;
            for (int i = timeB; i < timeA; i++)
            {
                B[i] = B[timeB-1];
            }
        } else if (timeA < timeB)
        {
            maxT = timeB;
            for (int i = timeA; i < timeB; i++)
            {
                A[i] = A[timeA-1];
            }
        }

        int ans = 0;
        for (int i = 1; i < maxT; i++)
        {
            if (A[i] == B[i] && A[i-1] != B[i-1])
            {
                ans++;
            }
        }
        System.out.print(ans);
        
        // Please write your code here.
    }
}