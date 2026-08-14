import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int height, weight, number;

    public Student(int height, int weight, int number)
    {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student student)
    {
        if (this.height == student.height)
        {
            return student.weight - this.weight;
        }
        return this.height - student.height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] ps = new Student[n];
        for (int i = 0; i < n; i++)
        {
            ps[i] = new Student(sc.nextInt(), sc.nextInt(), i+1);
        }
        Arrays.sort(ps);
        for (int i = 0; i < n; i++)
        {
            System.out.println(ps[i].height + " " + ps[i].weight + " " + ps[i].number);
        }
    }
}