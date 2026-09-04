import java.util.Scanner;
import java.util.Arrays;

class Xp implements Comparable<Xp>{
    int x1;
    int x2;
    boolean isCrossed;

    public Xp(int x1, int x2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.isCrossed = false;
    }

    @Override
    public int compareTo(Xp xp)
    {
        return x1 - xp.x1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Xp[] xps = new Xp[n];
        for (int i = 0; i < n; i++)
        {
            xps[i] = new Xp(0, 0);
        }
        for (int i = 0; i < n; i++) {
            xps[i].x1 = sc.nextInt();
            xps[i].x2 = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(xps);

        int ans = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == j)
                {
                    continue;
                }
                if (!(xps[i].x1 < xps[j].x1 && xps[i].x2 < xps[j].x2) && !(xps[i].x1 > xps[j].x1 && xps[i].x2 > xps[j].x2))
                {
                    xps[i].isCrossed = true;
                    xps[j].isCrossed = true;
                }
            }
        }

        for (int i = 0; i < n; i++)
        {
            if (xps[i].isCrossed == false)
            {
                ans++;
            }
        }
        System.out.println(ans);
    }
}