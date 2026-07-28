public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        for (int i = 0; i < 5; i++)
        {
            print10Stars();
        }
    }

    private static void print10Stars()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}