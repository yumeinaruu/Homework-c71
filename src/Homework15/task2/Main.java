package Homework15.task2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> animals = new LinkedList<>();
        Animal animal = new Animal();
        System.out.println("Сколько животных хотите добавить?");
        int len = scanner.nextInt();
        for(int i = 0; i < len; i++){
            System.out.println("Введите " + (i+1) + " животное:");
            animal.WriteAnimal(animals);
        }
        System.out.println(animals);

        System.out.println("Сколько животных хотите удалить?");
        len = scanner.nextInt();
        for(int i = 0; i < len; i++){
            animal.DeleteAnimal(animals);
        }
        System.out.println(animals);
    }
}
