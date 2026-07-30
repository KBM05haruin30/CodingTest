import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strarr = str.split("-");
        System.out.print(strarr[2]+"."+strarr[0]+"."+strarr[1]);
    }
}