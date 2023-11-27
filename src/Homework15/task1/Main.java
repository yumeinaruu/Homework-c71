package Homework15.task1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Сколько чисел вы хотите ввести?");
        int len = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            System.out.println("Введите " + (i+1) + " число: ");
            set.add(scanner.nextInt());
        }
        System.out.println("Полученные элементы:\n" + set);
    }
}
