package Homework9.Task3.CloneOverride;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square implements Cloneable {
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public Square clone() throws CloneNotSupportedException {
        return (Square) super.clone();
    } //CloneNotSupportedException Вызывается, чтобы указать, что метод clone в классе был вызван для клонирования
    // объекта, но класс объекта не реализует интерфейс Cloneable.
}
