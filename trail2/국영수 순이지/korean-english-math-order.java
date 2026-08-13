import java.util.Scanner;
import java.util.Arrays;


class Student implements Comparable<Student>{
    String name;
    int korean, english, math;

    public Student(String name, int korean, int english, int math)
    {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Student student)
    {
        if (this.korean == student.korean)
        {
            if (this.english == student.english)
            {
                return student.math - this.math;
            }
            return student.english - this.english;
        }
        return student.korean - this.korean;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];
        Student[] std = new Student[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            korean[i] = sc.nextInt();
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();
            std[i] = new Student(names[i], korean[i], english[i], math[i]);
        }
        Arrays.sort(std);
        for (int i = 0; i < n; i++)
        {
            System.out.println(std[i].name + " " + std[i].korean + " " + std[i].english + " " + std[i].math);
        }
        // Please write your code here.
    }
}