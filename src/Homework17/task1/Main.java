package Homework17.task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
        //когда пользователю исполнится 100 лет. Использовать Date/Time API
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свою дату рождения:");
        LocalDate localDate = LocalDate.parse(scanner.nextLine());
        System.out.println("В " + localDate.plusYears(100) + " вам исполнится 100 лет");
    }
}
