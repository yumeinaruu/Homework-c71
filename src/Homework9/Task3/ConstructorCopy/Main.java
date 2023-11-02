package Homework9.Task3.ConstructorCopy;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(2);
        Square square1 = new Square(square);
        System.out.println("Оригинал:\t" + square.getA());
        System.out.println("Клон:   \t" + square1.getA());
        square1.setA(3);
        System.out.println("Оригинал:\t" + square.getA());
        System.out.println("Клон:   \t" + square1.getA());
    }
}

