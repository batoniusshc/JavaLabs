package org.example;

public class Sedan extends Auto{
    private double trunkVolume;

    public Sedan(String brand, int id, int horsepower, double trunkVolume) {
        super(brand, id, horsepower);
        this.trunkVolume = trunkVolume;
    }

    public double getTrunkVolume() {return trunkVolume;}
    public void setTrunkVolume(double t) {trunkVolume = t;}

    @Override
    public String toString() {
        return super.toString() + " объем багажника " + trunkVolume;
    }
}
