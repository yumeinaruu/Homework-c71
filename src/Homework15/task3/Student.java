package Homework15.task3;

import java.util.LinkedList;
import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String group;
    private int course;
    private int[] marks;

    public void setMarks(LinkedList<Student> linkedList, Student student) {
        System.out.println("Введите количество оценок: ");
        int len = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            student.marks[i] = scanner.nextInt();
        }
    }

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }

    public void DeleteStudent(LinkedList<Student> linkedList, Student student) {
        int sum = 0;

        for (int j = 0; j < student.marks.length; j++) {
            sum += marks[j];
        }

        if (sum >= 3) {
            System.out.println("Вы прошли на следующий курс!");
            student.course++;
        } else {
            System.out.println("Вы отчислены!");
            linkedList.remove(student);
        }
    }
}
