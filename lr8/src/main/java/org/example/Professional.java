package org.example;

public class Professional {
    private String name;
    private int experience;
    private double rating;

    public Professional(String name, int experience, double rating) {
        this.name = name;
        this.experience = experience;
        this.rating = rating;
    }

    public String getName() {return name;}
    public int getExperience() {return experience;}
    public double getRating() {return rating;}
    public void setName(String name) {this.name = name;}
    public void setExperience(int experience) {this.experience = experience;}
    public void setRating(double rating) {this.rating = rating;}

    public void work() {
        System.out.println("Выполняет работу");
    }

    public void displayInfo() {
        System.out.println("Имя " + name);
        System.out.println("Опыт " + experience + " лет");
        System.out.println("Рейтинг " + rating);
    }
    public void print1(){
        System.out.println("ghbdtn");
    }
}
