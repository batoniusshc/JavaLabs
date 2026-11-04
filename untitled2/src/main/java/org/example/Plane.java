package org.example;

public class Plane {
    String model;
    int capacity;
    int range;

    String getModel(){ return model;}
    int getCapacity(){ return capacity;}
    int getRange(){ return range;}
    void setModel(String m){ model = m;}
    void setCapacity(int c){ capacity = c;}
    void setRange(int r){ range = r;}

    Plane(String m, int c, int r) {
        setModel(m);
        setCapacity(c);
        setRange(r);
    }
}
