package org.example;

public class Doctor extends Professional{
    private String specialization;

    public Doctor(String name, int experience, double rating, String specialization) {
        super(name, experience, rating);
        this.specialization = specialization;
    }

    public String getSpecialization() {return specialization;}

    public void setSpecialization(String specialization) {this.specialization = specialization;}

    @Override
    public void work() {
        System.out.println("Лечит пациентов");
    }
    public void diagnose() {
        System.out.println(getName() + " ставит диагноз");
    }

    public void print(){
        System.out.println("ghbdtn");
    }
}
