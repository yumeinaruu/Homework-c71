package Homework8.Task2.with_static;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog.voice();
        System.out.println("What do u want dog to eat?");
        Dog.eat(scanner.nextLine());
    }
}
