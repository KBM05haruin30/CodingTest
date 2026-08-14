import java.util.Scanner;
import java.util.Arrays;

class Num implements Comparable<Num>{
    int number, idx;

    public Num(int number, int idx)
    {
        this.number = number;
        this.idx = idx;
    }

    @Override
    public int compareTo(Num num)
    {
        return this.number - num.number;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Num[] nums = new Num[n];
        int[] nums_rank = new int[n+1];
        for (int i = 0; i < n; i++)
        {
            nums[i] = new Num(sc.nextInt(), i + 1);
        }
        Arrays.sort(nums);
        for (int i = 0; i < n; i++)
        {
            nums_rank[nums[i].idx] = i+1;
        }
        for (int i = 1; i <=n; i++)
        {
            System.out.print(nums_rank[i] + " ");
        }
        
    }
}