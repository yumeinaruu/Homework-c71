package Homework9.Task2;

import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Triangle extends Figure {
    Scanner scanner = new Scanner(System.in);

    @Override
    public double figureArea() {
        System.out.println("Каким методом вы хотите воспользоваться?\n1.Метод Герона\n2.Метод синуса\n3.Метод с выостой:");

        return switch (scanner.nextInt()) {
            case 1 -> geronMethod();
            case 2 -> sinMethod();
            case 3 -> highMethod();
            default -> throw new IllegalStateException("Unexpected value: " + scanner.nextInt());
        };
    }

    private double geronMethod() {
        System.out.println("Введите длины трех сторон треугольника:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double p = (double) (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double sinMethod() {
        System.out.println("Введите длины двух соединенных сторон треугольника:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Введите угол между ними(в радианах):");
        double fi = scanner.nextDouble();
        return ((double) 1 / 2) * a * b * Math.sin(fi);
    }

    private double highMethod() {
        System.out.println("Введите длины стороны и высоты к этой стороне:");
        int a = scanner.nextInt();
        int h = scanner.nextInt();
        return ((double) 1 / 2) * a * h;
    }
}
