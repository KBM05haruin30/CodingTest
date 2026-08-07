import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        int s1l = s1.length();
        int s2l = s2.length();
        int s3l = s3.length();
        int max = (s1l > s2l ? s1l : s2l)>(s2l > s3l ? s2l : s3l) ? (s1l > s2l ? s1l : s2l) : (s2l > s3l ? s2l : s3l);
        int min = (s1l > s2l ? s2l : s1l) > (s2l > s3l ? s3l : s2l) ? (s2l > s3l ? s3l : s2l) : (s1l > s2l ? s2l : s1l);
        System.out.print(max - min);
    }
}