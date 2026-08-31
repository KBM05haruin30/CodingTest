import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dev = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            dev[i] = sc.nextInt();
        }
        // Please write your code here.
        int sum = 0;
        for (int i = 0; i < 5; i++)
        {
            sum += dev[i];
        }

        boolean isExist = false;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                for (int k = 0; k < 5; k++)
                {
                    if (i != j && j != k && k != i)
                    {
                        int firstTeam = dev[i] + dev[j];
                        int secondTeam = dev[k];
                        int thirdTeam = sum - firstTeam - secondTeam;

                        if (firstTeam != secondTeam && secondTeam != thirdTeam && thirdTeam != firstTeam)
                        {
                            isExist = true;
                            int maxAvility = Math.max(Math.max(firstTeam, secondTeam), thirdTeam);
                            int minAvility = Math.min(Math.min(firstTeam, secondTeam), thirdTeam);
                            diff = Math.min(diff, (maxAvility - minAvility));
                        }
                    }
                }
            }
        }
        if (isExist)
        {
            System.out.println(diff);
        } else
        {
            System.out.println(-1);
        }
        

        
    }
}