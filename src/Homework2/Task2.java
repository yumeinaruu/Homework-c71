package Homework2;

//Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
//Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the temperature: ");
            int t = scanner.nextInt();
            if (t > -5) {
                System.out.println("Warm");
            } else if (t <= -5 && t > -20) {
                System.out.println("Normal");
            } else {
                System.out.println("Cold");
            }
            System.out.println("Если хочешь продолжить - 1\nЕсли завершить - другое число: ");
            int choice = scanner.nextInt();
            if(choice != 1){
                break;
            }
        }
    }
}
