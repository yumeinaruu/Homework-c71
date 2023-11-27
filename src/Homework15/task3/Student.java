package Homework15.task3;

import java.util.LinkedList;

public class Student {
    private String name;
    private String group;
    private int course;
    private Integer[] marks;

    public void setMarks(Integer... marks) {
        for(int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }

    public Student(String name, String group, int course, Integer... marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        for(int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }

    public void DeleteStudent(LinkedList<Student> linkedList, Student student){
        int sum = 0;
        for(int i = 0; i < linkedList.toArray().length; i++){
            for(int j = 0; j < student.marks.length; i++){
                sum += marks[j];
            }
            if(sum >= 3) {
                System.out.println("Вы прошли на следующий курс!");
                student.course++;
            } else {
                System.out.println("Вы отчислены!");
                linkedList.remove(student);
            }
        }
    }
}
