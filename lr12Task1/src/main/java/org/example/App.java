package org.example;

import java.util.HashMap;
import java.util.Map;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Map<String, Auto> autos = new HashMap<>();

        autos.put("Toyota",
                new Sedan("Toyota", 1, 150, 470));

        autos.put("BMW",
                new Sedan("BMW", 2, 190, 480));

        autos.put("Mercedes",
                new Sedan("Mercedes", 3, 210, 500));

        autos.put("Volvo",
                new SUV("Volvo", 4, 250, 23));

        autos.put("Jeep",
                new SUV("Jeep", 5, 270, 25));

        autos.put("Land Rover",
                new SUV("Land Rover", 6, 300, 24));

        autos.put("Ferrari",
                new SportsCar("Ferrari", 7, 670, 340));

        autos.put("Lamborghini",
                new SportsCar("Lamborghini", 8, 640, 325));

        for(Map.Entry<String, Auto> entry : autos.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
