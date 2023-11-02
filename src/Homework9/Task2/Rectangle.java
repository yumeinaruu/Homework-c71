package Homework9.Task2;

import java.util.Scanner;

public class Rectangle extends Figure{
    Scanner scanner = new Scanner(System.in);
    @Override
    public double figureArea() {
        System.out.println("Введите длины двух сопрекасающихся сторон прямоугольника:");
        return scanner.nextInt() * scanner.nextInt();
    }
}
