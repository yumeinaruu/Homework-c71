package Homework9.Task3.ConstructorCopy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square{
    int a;

    public Square(int a) {
        this.a = a;
    }

    public Square(Square copySquare){
        this(copySquare.getA());
    }
}