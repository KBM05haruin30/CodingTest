import java.util.Scanner;
import java.util.Arrays;

class Patmal implements Comparable<Patmal>{
    int position;
    char c;

    public Patmal()
    {
        this.position = 0;
        this.c = 'a';
    }

    public Patmal(int position, char c)
    {
        this.position = position;
        this.c = c;
    }

    @Override
    public int compareTo(Patmal patmal)
    {
        return position - patmal.position;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Patmal[] patmals = new Patmal[n];
        for (int i = 0; i < n; i++)
        {
            patmals[i] = new Patmal();
        }
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            char ch = sc.next().charAt(0);
            patmals[i].position = position;
            patmals[i].c = ch;
        }
        // Please write your code here.
        Arrays.sort(patmals);

        int max_val = 0;
        for (int i = 0; i < n; i++)
        {   
            int cntG = 0;
            int cntH = 0;
            int size = 0;
            for (int j = i; j < n; j++)
            {
                if (patmals[j].c == 'G')
                {
                    cntG++;
                } else if (patmals[j].c == 'H')
                {
                    cntH++;
                }

                if (cntH == 0 || cntG == 0 || cntH == cntG)
                {
                    size = patmals[j].position - patmals[i].position;
                }
            }
            max_val = Math.max(max_val, size);
        }
        System.out.println(max_val);
    }
}