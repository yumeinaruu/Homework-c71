package Homework13.task1;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "Логин введен неправильно";
    }
}
