package Homework15.task3;

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
            linkedList.add(new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextInt()));
            System.out.println("Введите оценки студента: ");
            linkedList.get(i).setMarks(linkedList, linkedList.get(i));
            linkedList.get(i).DeleteStudent(linkedList, linkedList.get(i));
        }
        System.out.println(linkedList);
    }
}
