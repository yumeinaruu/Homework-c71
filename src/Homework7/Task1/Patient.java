package Homework7.Task1;

public class Patient {
    private int curePlan;
    private Therapist doctor = new Therapist();

    public Patient(int curePlan) {
        this.curePlan = curePlan;
    }

    public void curing(){
        doctor.receptionResult(curePlan);
    }
}
