package Homework17.task5;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Используя Supplier написать метод, который будет возвращать введенную с консоли
        //строку задом наперед.
        Scanner scanner = new Scanner(System.in);
        Supplier<String> supplier = () -> {
            System.out.println("Введите строку:");
            return new StringBuilder(scanner.nextLine()).reverse().toString();
        };
        System.out.println("Ваша строка задом наперед: " + supplier.get());
    }
}
