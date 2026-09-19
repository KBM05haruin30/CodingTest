import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        Arrays.sort(arr);

        for(int A = 1; A <= 40; A++)
        {
            for (int B = A; B <= 40; B++)
            {
                for (int C = B; C <= 40; C++)
                {
                    for (int D = C; D <= 40; D++)
                    {
                        int[] candidate = new int[]{
                            A, B, C, D,
                            A+B, B+C, C+D, D+A, A+C, B+D,
                            A+B+C, A+B+D, A+C+D, B+C+D,
                            A+B+C+D
                        };

                        Arrays.sort(candidate);

                        if (Arrays.equals(arr, candidate))
                        {
                            System.out.println(A + " " + B + " " + C + " " + D);
                            return;
                        }

                    }
                }
            }

        }
    }
}