import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        int S = sc.nextInt();

        int[] eatPerson = new int[D];
        int[] eatCheese = new int[D];
        int[] eatTime = new int[D];
        for (int i = 0; i < D; i++) {
            eatPerson[i] = sc.nextInt();
            eatCheese[i] = sc.nextInt();
            eatTime[i] = sc.nextInt();
        }

        int[] sickPerson = new int[S];
        int[] sickTime = new int[S];
        for (int i = 0; i < S; i++) {
            sickPerson[i] = sc.nextInt();
            sickTime[i] = sc.nextInt();
        }

        // Please write your code here.
        int maxAns = 0;

        for (int i = 1; i <= 50; i++)
        {
            boolean isPossible = true;

            for (int j = 0; j < S; j++)
            {
                boolean ateBeforeSick = false;

                for (int k = 0; k < D; k++)
                {
                    if (sickPerson[j] == eatPerson[k] && eatCheese[k] == i &&sickTime[j] > eatTime[k])
                    {
                        ateBeforeSick = true;
                        break;
                    }
                }

                if (!ateBeforeSick)
                {
                    isPossible = false;
                    break;
                }
            }

            if (isPossible)
            {
                boolean[] ateThisCheese = new boolean[N + 1];
                for (int k = 0; k < D; k++)
                {
                    if (eatCheese[k] == i)
                    {
                        ateThisCheese[eatPerson[k]] = true;
                    }
                }

                int cnt = 0;
                for (int k = 1; k <= N; k++)
                {
                    if (ateThisCheese[k])
                    {
                        cnt++;
                    }
                }
                maxAns = Math.max(maxAns, cnt);
            }
        }
        System.out.println(maxAns);
    }
}
