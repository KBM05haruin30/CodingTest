import java.util.Scanner;

class M{
    char codeName;
    int score;

    public M()
    {
        codeName = ' ';
        score = 0;
    }

    public M(char codeName, int score)
    {
        this.codeName = codeName;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        M[] m = new M[5];
        for (int i = 0; i < 5; i++)
        {
            char codeName = sc.next().charAt(0);
            int score = sc.nextInt();
            m[i] = new M(codeName, score);
        }
        int min_score = Integer.MAX_VALUE;
        M ans = new M();
        for (int i = 0; i < 5; i++)
        {
            if (min_score > m[i].score)
            {
                min_score = m[i].score;
                ans.codeName = m[i].codeName;
                ans.score = m[i].score;
            }
        }

        System.out.print(ans.codeName + " " + ans.score);
    }
}