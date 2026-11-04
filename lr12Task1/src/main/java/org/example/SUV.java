package org.example;

public class SUV extends Auto{
    private double groundClearance;

    public SUV(String brand, int id, int horsepower, double groundClearance) {
        super(brand, id, horsepower);
        this.groundClearance = groundClearance;
    }

    public double getGroundClearance() {return groundClearance;}
    public void setGroundClearance(double g) {groundClearance = g;}

    @Override
    public String toString() {
        return super.toString() + " дорожный просвет " + groundClearance;
    }
}
