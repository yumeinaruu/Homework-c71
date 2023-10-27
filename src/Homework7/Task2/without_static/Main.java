package Homework7.Task2.without_static;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do u want dog to eat?");
        Dog dog = Dog.makeObject(scanner.nextLine());
        dog.voice();
        dog.eat();
    }
}
