package Homework2;

//Напишите программу, где пользователь вводит любое целое положительное число. А
//программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
//числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
//ввести некорректные данные.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        System.out.print("Введите число: ");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            for (int i = 1; i <= num; i++) {
                sum = sum + i;
            }
            System.out.println("Сумма всех чисел: " + sum);
        } else {
            System.out.println("Введено неверное число. Попробуй снова");
        }
    }
}
