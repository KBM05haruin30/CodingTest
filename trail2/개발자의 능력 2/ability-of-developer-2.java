import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dev = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++)
        {
            dev[i] = sc.nextInt();
        }
        // Please write your code here.

        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < 6; i++)
        {
            sum += dev[i];
        }
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                for (int k = 0; k < 6; k++)
                {
                    for (int z = 0; z < 6; z++)
                    {
                        if (i != j && i != k && i != z && j != k && j != z && k != z)
                        {
                            int firstTeam = dev[i] + dev[j];
                            int secondTeam = dev[k] + dev[z];
                            int thirdTeam = sum - firstTeam - secondTeam;

                            int maxAvility = Math.max(Math.max(firstTeam, secondTeam), thirdTeam);
                            int minAvility = Math.min(Math.min(firstTeam, secondTeam), thirdTeam);
                            int diff = maxAvility - minAvility;
                            ans = Math.min(ans, diff);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}