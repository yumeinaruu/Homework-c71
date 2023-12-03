package Homework15.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {
    static Object[] elementData;
    private int size = 10;
    private int s = 0;

    public MyArrayList() {
        this.elementData = new Object[size];
    }

    public MyArrayList(int size) {
        this.elementData = new Object[size];
    }

    public void add(MyArrayList<T> myArrayList, T t) {
        if (s == MyArrayList.elementData.length) {
            MyArrayList.elementData = Arrays.copyOf(MyArrayList.elementData, elementData.length * 2);
            MyArrayList.elementData[s] = t;
            s++;
        } else {
            MyArrayList.elementData[s] = t;
            s++;
        }
    }

    public void remove(MyArrayList<T> myArrayList, int index) {
        for(int i = index; i < elementData.length - 1; i++){
            elementData[i] = elementData[i+1];
        }
    }

    public T get(MyArrayList<T> myArrayList, int index) {
        return (T) elementData[index];
    }

    public boolean contains(MyArrayList<T> myArrayList, T container) {
        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i] == container) {
                return true;
            }
        }
        return false;
    }

    public void clean(MyArrayList<T> myArrayList) {
        Arrays.fill(elementData, null);
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }
}
