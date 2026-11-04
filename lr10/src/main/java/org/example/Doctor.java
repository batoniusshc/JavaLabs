package org.example;

public class Doctor implements Workable, Teachable {
    private String name;
    private int experience;
    private String specialization;
    private int students;

    public Doctor(String name, int experience, String specialization, int students) {
        this.name = name;
        this.experience = experience;
        this.specialization = specialization;
        this.students = students;
    }

    public String getName() {return name;}
    public void setName(String n) {name = n;}
    @Override
    public int getExperience() {return experience;}
    public void setExperience(int e) {experience = e;}
    public String getSpecialization() {return specialization;}
    public void setSpecialization(String s) {specialization = s;}
    @Override
    public int getStudents() {return students;}
    public void setStudents(int s) {students = s;}

    @Override
    public void work() {
        System.out.println(name + " лечит пациентов");
    }

    @Override
    public void teach() {
        System.out.println(name + " обучает студентов-медиков");
    }

}
