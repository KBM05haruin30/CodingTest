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
            if (this.weight == student.weight)
            {
                return this.number - student.number;
            }
            return student.weight - this.weight;
        }
        return student.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            students[i] = new Student(height[i], weight[i], i+1);
        }
        Arrays.sort(students);

        for (int i = 0; i < n; i++)
        {
            System.out.println(students[i].height + " " + students[i].weight + " " + students[i].number);
        }
        // Please write your code here.
    }
}