package Homework13.task1;

public class User {
    private String login;
    private String password;
    private String confirmPassword;

    public User(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || login.matches("(.*) (.*)+") || !login.matches("(.*)\\d(.*)")) {
            try {
                throw new WrongLoginException("Error");
            } catch (WrongLoginException e) {
                System.out.println(e);
                return false;
            }
        }
        if (password.length() > 20 || password.matches("(.*) (.*)+") || !password.matches("(.*)\\d(.*)") || !password.equals(confirmPassword)) {
            try {
                throw new WrongPasswordException("Error");
            } catch (WrongPasswordException e) {
                System.out.println(e);
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Объект создан";
    }
}
