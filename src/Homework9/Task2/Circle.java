package Homework9.Task2;

import java.util.Scanner;

public class Circle extends Figure{
    Scanner scanner = new Scanner(System.in);
    @Override
    public double figureArea() {
        System.out.println("Введите радиус окружности:");
        return Math.PI * Math.pow(scanner.nextInt(), 2);
    }
}
