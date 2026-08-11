import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(nums);
        int[] answNum = new int[2*n];
        for (int i = 0; i < 2*n; i++)
        {
            answNum[i] = nums[i] + nums[2*n-i-1];
        }
        Arrays.sort(answNum);
        System.out.print(answNum[2*n-1]);

    }
}