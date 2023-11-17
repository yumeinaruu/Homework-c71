package Homework13.task1;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "Пароль введен неправильно";
    }
}
