package org.example;

import java.util.Scanner;

public class Ticket {
    String event;
    String seatNumber;
    double price;

    public void setName(String e){
        event = e;
    }
    public void setSeatNumber(String sN){seatNumber = sN;}
    public void setPrice(double p){price = p;}

    public String getEvent(){return event;}
    public String getSeatNumber(){return seatNumber;}
    public double getPrice(){return price;}

    public Ticket(String e, String sN, double p){
        setName(e);
        setSeatNumber(sN);
        setPrice(p);
    }

    void applyDiscount(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите скидку ,");
        double s = in.nextDouble();
        while (s > 1 || s < 0) {
            System.out.println("Введите корректную скидку ");
            s = in.nextDouble();
        }
        System.out.println(price*(1-s));
    }
    void displayInfo() {
        System.out.println("Мероприятие " + event);
        System.out.println("Место " + seatNumber);
        System.out.println("Цена " + price);
    }

    @Override
    public String toString() {
        return getEvent() +" "+ getSeatNumber() +" "+ getPrice();
    }
}
