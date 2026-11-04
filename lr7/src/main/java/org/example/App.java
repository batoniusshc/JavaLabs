package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        FootballClub club1 = new FootballClub("Arsenal", "England", 25);
        FootballClub club2 = new FootballClub("Barcelona", "Spain", 30);
        FootballClub club3 = new FootballClub("Milan", "Italy", 20);
        FootballClub club4 = new FootballClub("Bayern", "Germany", 28);
        FootballClub club5 = new FootballClub("PSG", "France", 24);
        FootballClub club6 = new FootballClub("Ajax", "Netherlands", 17);

        System.out.println("Среднее кол-во очков " + FootballClub.getAveragePoints());
    }

}
