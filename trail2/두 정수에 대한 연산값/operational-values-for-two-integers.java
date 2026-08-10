import java.util.Scanner;

class IntWrapper{
    int value;

    public IntWrapper(int value)
    {
        this.value = value;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        IntWrapper x = new IntWrapper(a);
        IntWrapper y = new IntWrapper(b);
        cal(x, y);
        System.out.print(x.value + " " + y.value);
    }

    public static void cal(IntWrapper x, IntWrapper y)
    {
        if (x.value > y.value)
        {
            x.value += 25;
            y.value *= 2;
        } else
        {
            y.value += 25;
            x.value *= 2;
        }
    }
}