package Homework15.task3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Student> linkedList = new LinkedList<>();
        System.out.println("Сколько студентов добавить?");
        int len = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            System.out.println("Добавление " + (i+1) + " студента:");
            System.out.println("Введите имя, группу и номер курса студента:");
            String name = scanner.next();
            int group = scanner.nextInt();
            int course = scanner.nextInt();
            linkedList.add(new Student(name, group, course));
            linkedList.get(i).setMarks(linkedList.get(i));
            linkedList.get(i).DeleteStudent(linkedList, linkedList.get(i));
        }
        System.out.println("Какой курс вам нужен?");
        Student.printStudents(linkedList, scanner.nextInt());
    }
}
