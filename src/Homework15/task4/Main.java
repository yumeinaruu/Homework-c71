package Homework15.task4;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(myArrayList, 1);
        myArrayList.add(myArrayList, 2);
        myArrayList.add(myArrayList, 3);
        myArrayList.add(myArrayList, 4);
        myArrayList.add(myArrayList, 5);
        myArrayList.add(myArrayList, 6);
        myArrayList.add(myArrayList, 7);
        myArrayList.add(myArrayList, 8);
        myArrayList.add(myArrayList, 9);
        myArrayList.add(myArrayList, 10);
        myArrayList.add(myArrayList, 11);
        System.out.println(myArrayList);
        myArrayList.remove(myArrayList, 1);
        myArrayList.remove(myArrayList, 3);
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(myArrayList, 4));
        System.out.println(myArrayList.contains(myArrayList, 8));
        System.out.println(myArrayList.contains(myArrayList, 45));
        myArrayList.clean(myArrayList);
        System.out.println(myArrayList);

        MyArrayList<Integer> myArrayList1 = new MyArrayList<>(5);
        System.out.println(myArrayList1);
    }
}
