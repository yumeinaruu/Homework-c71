package Homework17.task3;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //Используя Function реализовать лямбду, которая будет принимать в себя строку в
        //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //возвращать сумму, переведенную сразу в доллары.
        Scanner scanner = new Scanner(System.in);
        Function<String, Double> function = (byn) -> {
            String[] value = byn.split(" ");
            return (double) (Double.parseDouble(value[0])/3.1);
        };
        System.out.println("Введите сумму в BYN в формате '*сумма* BYN':");
        String cost = scanner.nextLine();
        System.out.println("Ваша сумма в долларах: " + function.apply(cost) + " USD");
    }
}
