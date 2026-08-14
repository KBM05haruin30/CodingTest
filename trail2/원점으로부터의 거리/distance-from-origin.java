import java.util.Scanner;
import java.util.Arrays;

class Dot implements Comparable<Dot>{
    int x, y, number;

    public Dot(int x, int y, int number)
    {
        this.x = x;
        this.y = y;
        this.number = number;
    }

    @Override
    public int compareTo(Dot dot)
    {
        int x1, y1, x2, y2;
        if (this.x > 0)
        {
            x1 = this.x;
        } else
        {
            x1 = -this.x;
        }
        if (this.y > 0)
        {
            y1 = this.y;
        } else
        {
            y1 = -this.y;
        }
        if (dot.x > 0)
        {
            x2 = dot.x;
        } else
        {
            x2 = -dot.x;
        }
        if (dot.y > 0)
        {
            y2 = dot.y;
        } else
        {
            y2 = -dot.y;
        }
        if ((x1+y1) == (x2+y2))
        {
            return this.number - dot.number;
        }
        return (x1+y1) - (x2+y2);
    }

}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dot[] dots = new Dot[n];
        for (int i = 0; i < n; i++)
        {
            dots[i] = new Dot(sc.nextInt(), sc.nextInt(), i+1);
        }
        Arrays.sort(dots);
        for(int i = 0; i < n; i++)
        {
            System.out.println(dots[i].number);
        }
    }
}