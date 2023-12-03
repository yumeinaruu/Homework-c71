package Homework15.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {
    static Object[] elementData;
    private int size = 10;
    private int s = 0;

    public MyArrayList() {
        elementData = new Object[size];
    }

    public MyArrayList(int size) {
        elementData = new Object[size];
    }

    public void add(T t) {
        if (s == elementData.length) {
            elementData = Arrays.copyOf(elementData, elementData.length * 2);
            elementData[s] = t;
            s++;
        } else {
            elementData[s] = t;
            s++;
        }
    }

    public void remove(int index) {
        for(int i = index; i < elementData.length - 1; i++){
            elementData[i] = elementData[i+1];
        }
    }

    public T get(int index) {
        return (T) elementData[index];
    }

    public boolean contains(T container) {
        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i] == container) {
                return true;
            }
        }
        return false;
    }

    public void clean() {
        Arrays.fill(elementData, null);
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }
}
