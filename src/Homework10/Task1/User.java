package Homework10.Task1;

import java.util.Objects;

public class User {
    private String userName;
    private int userAge;

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "userName='" + userName + '\'' +
                ", userAge=" + userAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User test = (User) o;
        return userAge == test.userAge && Objects.equals(userName, test.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userAge);
    }
}
