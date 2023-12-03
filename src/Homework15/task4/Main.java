package Homework15.task4;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(10);
        myArrayList.add(11);
        System.out.println(myArrayList);
        myArrayList.remove(1);
        myArrayList.remove(3);
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(4));
        System.out.println(myArrayList.contains(8));
        System.out.println(myArrayList.contains(45));
        myArrayList.clean();
        System.out.println(myArrayList);

        MyArrayList<Integer> myArrayList1 = new MyArrayList<>(5);
        System.out.println(myArrayList1);
    }
}
