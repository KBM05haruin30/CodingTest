import java.util.Scanner;

class Tile
{
    int val, white, black;

    public Tile(int val, int white, int black)
    {
        this.val = val;
        this.white = white;
        this.black = black;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Tile[] tiles = new Tile[200001];
        for (int i = 0; i < tiles.length; i++)
        {
            tiles[i] = new Tile(0, 0, 0);
        }
        int pos = 100000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            if (d == 'L')
            {
                while(x-- > 0)
                {
                    tiles[pos].white++;
                    tiles[pos].val = 1;
                    if (x > 0)
                    {
                        pos--;
                    }
                }
            } else if (d == 'R')
            {
                while(x-- > 0)
                {
                    tiles[pos].black++;
                    tiles[pos].val = 2;
                    if (x > 0)
                    {
                        pos++;
                    }
                }
            }
        }
        int white = 0;
        int black = 0;
        int gray = 0;
        for (int i = 0; i < tiles.length; i++)
        {
            if(tiles[i].white >= 2 && tiles[i].black >= 2)
            {
                gray++;
            } else if (tiles[i].val == 1)
            {
                white++;
            } else if (tiles[i].val == 2)
            {
                black++;
            }

        }

        System.out.print(white + " " + black + " " + gray);
        // Please write your code here.
    }
}