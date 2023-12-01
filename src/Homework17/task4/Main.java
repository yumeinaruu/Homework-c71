package Homework17.task4;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
        //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //выводить сумму, переведенную сразу в доллары
        Scanner scanner = new Scanner(System.in);
        Consumer<String> consumer = (byn) -> {
            String[] value = byn.split(" ");
            System.out.println("Ваша сумма в долларах: " + (double) (Double.parseDouble(value[0])/3.1) + " USD");
        };
        System.out.println("Введите сумму в BYN в формате '*сумма* BYN':");
        consumer.accept(scanner.nextLine());
    }
}
