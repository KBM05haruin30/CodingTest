import java.util.Scanner;

class Defuse{
    String uCode;
    char lcolor;
    int time;

    public Defuse(String ucode, char lcolor, int time)
    {
        this.uCode = ucode;
        this.lcolor = lcolor;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        Defuse defu = new Defuse(uCode, lColor, time);
        System.out.println("code : " + defu.uCode);
        System.out.println("color : " + defu.lcolor);
        System.out.println("second : " + defu.time);
    }
}