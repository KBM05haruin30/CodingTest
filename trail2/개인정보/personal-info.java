import java.util.Scanner;
import java.util.Arrays;

class Person
{
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Person[] ps = new Person[5];
        for (int i = 0; i < 5; i++)
        {
            ps[i] = new Person(sc.next(), sc.nextInt(), sc.nextDouble());
        }
        Arrays.sort(ps, (a, b) -> a.name.compareTo(b.name));
        System.out.println("name");
        for (int i = 0; i < 5; i++)
        {
            System.out.printf("%s %d %.1f\n", ps[i].name, ps[i].height, ps[i].weight);
        }
        System.out.print("\nheight\n");
        Arrays.sort(ps, (a, b) -> (b.height - a.height));
        for (int i = 0; i < 5; i++)
        {
            System.out.printf("%s %d %.1f\n", ps[i].name, ps[i].height, ps[i].weight);
        }
    }
}