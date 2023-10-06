package Homework2;

//Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int num = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Если хочешь использовать while - 1\nЕсли хочешь использовать for - 2\nТвой выбор: ");
        int option = scanner.nextInt();
        if (option == 1) {
            option1(num);
        } else if(option == 2){
            option2();
        } else{
            System.out.println("Неправильный ввод");
        }
    }

    static void option1(int num) {
        while (num <= 20) {
            System.out.println("Квадрат числа " + num + " равен " + (num * num));
            num++;
        }
    }

    static void option2(){
        for(int num = 10; num <= 20; num++){
            System.out.println("Квадрат числа " + num + " равен " + (num * num));
        }
    }
}
