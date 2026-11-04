package org.example;

public class Auto {
    private String brand;
    private int id;
    private int horsepower;

    public Auto(String brand, int id, int horsepower) {
        this.brand = brand;
        this.id = id;
        this.horsepower = horsepower;
    }

    public String getBrand() {return brand;}
    public void setBrand(String b) {brand = b;}
    public int getId() {return id;}
    public void setId(int i) {id = i;}
    public int getHorsepower() {return horsepower;}
    public void setHorsepower(int h) {horsepower = h;}

    @Override
    public String toString() {
        return brand + id + horsepower;
    }
}
