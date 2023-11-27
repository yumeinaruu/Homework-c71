package Homework15.task2;

import java.util.LinkedList;
import java.util.Scanner;

public class Animal {
    Scanner scanner = new Scanner(System.in);

    public void WriteAnimal(LinkedList<String> linkedList){
        linkedList.addFirst(scanner.nextLine());
    }

    public void DeleteAnimal(LinkedList<String> linkedList){
        linkedList.removeLast();
    }

}
