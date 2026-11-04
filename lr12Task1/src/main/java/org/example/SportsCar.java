package org.example;

public class SportsCar extends Auto{
    private int topSpeed;

    public SportsCar(String brand, int id, int horsepower, int topSpeed) {
        super(brand, id, horsepower);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {return topSpeed;}
    public void setTopSpeed(int t) {topSpeed = t;}

    @Override
    public String toString() {
        return super.toString()
                + " максимальная скорость " + topSpeed;
    }
}
