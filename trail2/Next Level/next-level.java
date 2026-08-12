import java.util.Scanner;

class Account{
    String id;
    int level;

    public Account()
    {
        this.id = "codetree";
        this.level = 10;
    }

    public Account(String id, int level)
    {
        this.id = id;
        this.level = level;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        Account m1 = new Account();
        Account m2 = new Account(id, level);

        System.out.println("user " + m1.id + " lv " + m1.level);
        System.out.println("user " + m2.id + " lv " + m2.level);
    }
}