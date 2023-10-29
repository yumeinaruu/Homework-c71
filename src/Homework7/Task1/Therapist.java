package Homework7.Task1;

public class Therapist extends Doctor{
    @Override
    public void cure() {
        System.out.println("Mental help");
    }

    public void receptionResult(int curePlan){
        if(curePlan == 1){
            Doctor surgeon = new Surgeon();
            surgeon.cure();
        } else if (curePlan == 2){
            Doctor dentist = new Dentist();
            dentist.cure();
        } else {
            cure();
        }
    }
}
