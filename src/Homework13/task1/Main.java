package Homework13.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин, пароль, а затем снова введите пароль для проверки");
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        String confirmPassword = scanner.nextLine();
        if (!User.check(login, password, confirmPassword)) {
            System.exit(0);
        }
        User user = new User(login, password, confirmPassword);
        System.out.println(user);
    }
}
