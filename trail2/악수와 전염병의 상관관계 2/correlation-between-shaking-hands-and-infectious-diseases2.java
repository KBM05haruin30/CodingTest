import java.util.Scanner;
import java.util.Arrays;

class Shakes implements Comparable<Shakes>{
    int time;
    int dev1;
    int dev2;

    public Shakes(int time, int dev1, int dev2)
    {
        this.time = time;
        this.dev1 = dev1;
        this.dev2 = dev2;
    }

    @Override
    public int compareTo(Shakes shake)
    {
        return this.time - shake.time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();

        int[] devGamYumOX = new int[N+1];
        int[] gamyumCnt = new int[N+1];
        devGamYumOX[P] = 1;
        gamyumCnt[P] = K;

        Shakes[] shake = new Shakes[T];
        for (int i = 0; i < T; i++)
        {
            int time = sc.nextInt();
            int dev1 = sc.nextInt();
            int dev2 = sc.nextInt();
            shake[i] = new Shakes(time, dev1, dev2);
        }

        Arrays.sort(shake);

        for (int i = 0; i < T; i++)
        {
            int a = shake[i].dev1;
            int b = shake[i].dev2;
            // 둘 다 감염
            if (devGamYumOX[a] == 1 && devGamYumOX[b] == 1)
            {
                gamyumCnt[a]--;
                gamyumCnt[b]--;
            }
            // dev1만 감염
            else if (devGamYumOX[a] == 1 && devGamYumOX[b] == 0)
            {
                if (gamyumCnt[a] > 0)
                {
                    devGamYumOX[b] = 1;
                    gamyumCnt[a]--;
                    gamyumCnt[b] = K;
                }
            }
            // dev2만 감염
            else if (devGamYumOX[a] == 0 && devGamYumOX[b] == 1)
            {
                if (gamyumCnt[b] > 0)
                {
                    devGamYumOX[a] = 1;
                    gamyumCnt[b]--;
                    gamyumCnt[a] = K;
                }
            }
        }

        for (int i = 1; i <=N; i++)
        {
            System.out.print(devGamYumOX[i]);
        }
        // Please write your code here.
    }
}