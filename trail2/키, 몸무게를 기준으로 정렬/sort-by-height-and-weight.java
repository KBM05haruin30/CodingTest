import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

// class Person implements Comparable<Person>{
//     String name;
//     int height, weight;

//     public Person(String name, int height, int weight)
//     {
//         this.name = name;
//         this.height = height;
//         this.weight = weight;
//     }

//     @Override
//     public int compareTo(Person person)
//     {
//         if (this.height == person.height)
//         {
//             return person.weight - this.weight;
//         }
//         return this.height - person.height;
//     }
// }

class Person{
    String name;
    int height, weight;

    public Person(String name, int height, int weight)
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
        int n = sc.nextInt(); 
        Person[] ps = new Person[n];
        for (int i = 0; i < n; i++)
        {
            ps[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(ps, new Comparator<Person>(){
            @Override
            public int compare(Person a, Person b)
            {
                if (a.height == b.height)
                {
                    return b.weight - a.weight;
                }
                return a.height - b.height;
            }
        });
        for (int i = 0; i < n; i++)
        {
            System.out.println(ps[i].name + " " + ps[i].height + " " + ps[i].weight);
        }
    }
}