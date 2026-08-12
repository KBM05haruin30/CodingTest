import java.util.Scanner;

class Person{
    String name;
    String address;
    String regions;

    public Person(String name, String address, String regions)
    {
        this.name = name;
        this.address = address;
        this.regions = regions;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] ps = new Person[n];
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
            ps[i] = new Person(names[i], addresses[i], regions[i]);
        }
        Person p = ps[0];
        for (int i = 1; i < n; i++)
        {
            if ((p.name).compareTo(ps[i].name) < 0)
            {
                p.name = ps[i].name;
                p.address = ps[i].address;
                p.regions = ps[i].regions;
            }
        }

        System.out.println("name " + p.name);
        System.out.println("addr " + p.address);
        System.out.println("city " + p.regions);
        // Please write your code here.
    }
}