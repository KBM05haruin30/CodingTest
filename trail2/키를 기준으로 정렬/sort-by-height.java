import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

// class Student implements Comparable<Student>{
//     String name;
//     int height, weight;

//     public Student(String name, int height, int weight)
//     {
//         this.name = name;
//         this.height = height;
//         this.weight = weight;
//     }

//     @Override
//     public int compareTo(Student student)
//     {
//         // if (this.height > student.height)
//         // {
//         //     return 1;
//         // } else if (this.height < student.height)
//         // {
//         //     return -1;
//         // } else
//         // {
//         //     return 0;
//         // }
//         return this.height - student.height;
//     }

// }

class Student{
    String name;
    int height, weight;

    public Student(String name, int height, int weight)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] height = new int[n];
        int[] weight = new int[n];
        Student[] std = new Student[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            std[i] = new Student(name[i], height[i], weight[i]);
        }
        //Arrays.sort(std);

        // Arrays.sort(std, (a, b) -> a.height - b.height);

        Arrays.sort(std, new Comparator<Student>()
        {
            @Override
            public int compare(Student a, Student b)
            {
                return a.height - b.height;
            }
        });

        for(int i = 0; i < n; i++)
        {
            System.out.println(std[i].name + " " + std[i].height + " " + std[i].weight);
        }

        // Please write your code here.
    }
}