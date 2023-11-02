package Homework9.Task2;

public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triangle();
        Figure rectangle = new Rectangle();
        Figure circle = new Circle();
        System.out.println(triangle.figureArea() + " - площадь треугольника");
        System.out.println(rectangle.figureArea() + " - площадь прямоугольника");
        System.out.println(circle.figureArea() + " - площадь круга");
    }
}
