package org.example;

public class FootballClub {
    private String name;
    private String country;
    private int points;

    static int totalClubs = 0;
    static int totalPoints = 0;

    static public String print(){
        return totalPoints +" "+ totalClubs;
    }


    public String getName() {return name;}
    public String getCountry() {return country;}
    public int getPoints() {return points;}

    public FootballClub(String name, String country, int points) {
        this.name = name;
        this.country = country;
        this.points = points;
        totalClubs++;
        totalPoints += points;
    }
    @Override
    public String toString() {
        return getName() + " " + getCountry()+ " "+ getPoints() +" "+ totalClubs + " "+ totalPoints;
    }

    public static double getAveragePoints() {
        return (double) totalPoints / totalClubs;
    }

}

