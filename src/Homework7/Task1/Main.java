package Homework7.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal rabbit = new Rabbit();
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        while(true) {
            dog.voice();
            System.out.println("What do u want dog to eat? (it likes Meat, but can eat grass)");
            dog.eat(scanner.nextLine());
            rabbit.voice();
            System.out.println("What do u want rabbit to eat? (it likes Grass)");
            rabbit.eat(scanner.nextLine());
            tiger.voice();
            System.out.println("What do u want tiger to eat? (it likes Meat)");
            tiger.eat(scanner.nextLine());
            System.out.println("If u want to exit press 1, else press any number");
            int choice = scanner.nextInt();
            if(choice == 1){
                System.exit(1);
            }
        }
    }
}
