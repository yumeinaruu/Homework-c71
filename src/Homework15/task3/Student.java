package Homework15.task3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int group;
    private int course;
    private int[] marks;

    public Student(String name, int group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }

    public void setMarks(Student student) {
        System.out.println("Введите количество оценок: ");
        int len = scanner.nextInt();
        marks = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Введите оценку:");
            student.marks[i] = scanner.nextInt();
        }
    }

    public void DeleteStudent(LinkedList<Student> linkedList, Student student) {
        int sum = 0;

        for (int j = 0; j < student.marks.length; j++) {
            sum += marks[j];
        }

        sum = sum/student.marks.length;

        if (sum >= 3) {
            System.out.println("Вы прошли на следующий курс!");
            student.course++;
        } else {
            System.out.println("Вы отчислены!");
            linkedList.remove(student);
        }
    }

    public static void printStudents(LinkedList<Student> linkedList, int course) {
        for (int i = 0; i < linkedList.toArray().length; i++) {
            if (linkedList.get(i).course == course) {
                System.out.println("Студент: " + linkedList.get(i).toString() + " на " + course + " курсе");
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
