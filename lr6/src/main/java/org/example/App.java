package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("MineCraft", "ChillasArt", 4
        );
        Restaurant res = new Restaurant("jfhfh", "hfuhfu",45, 65);
        if (restaurant.isPopular()) {
            System.out.println("Ресторан Супер мега ультра крутой");
        } else {
            System.out.println("Туда не стоит идти");
        }
    }
}
