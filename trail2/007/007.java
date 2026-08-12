import java.util.Scanner;

class Mess
{
    String sCode;
    char mPoint;
    int time;

    public Mess(String sCode, char mPoint, int time)
    {
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.

        Mess message1 = new Mess(sCode, mPoint, time);
        System.out.println("secret code : " + message1.sCode);
        System.out.println("meeting point : " + message1.mPoint);
        System.out.println("time : " + message1.time);
    }
}