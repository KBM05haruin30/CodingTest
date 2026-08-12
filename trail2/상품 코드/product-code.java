import java.util.Scanner;

class Product{
    String id2;
    int code2;

    public Product()
    {
        this.id2 = "codetree";
        this.code2 = 50;
    }

    public Product(String id2, int code2)
    {
        this.id2 = id2;
        this.code2 = code2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        Product pd1 = new Product();
        Product pd2 = new Product(id2, code2);
        System.out.println("product " + pd1.code2 + " is " + pd1.id2);
        System.out.println("product " + pd2.code2 + " is " + pd2.id2);
    }
}