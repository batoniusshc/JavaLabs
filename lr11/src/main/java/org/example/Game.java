package org.example;

public class Game {
    private String name;
    private String genre;
    private double rating;

    public Game(String name, String genre, double rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    public String getName() {return name;}
    public String getGenre() {return genre;}
    public double getRating() {return rating;}
    public void setName(String n) {name = n;}
    public void setGenre(String g) {genre = g;}
    public void setRating(double r) {rating = r;}

    public void play(){
        System.out.println("Играю");
    }
    public void play(int level){
        System.out.println("Играю на уровне "+level);
    }
    public void play(String mode){
        System.out.println("Играю в режиме "+mode);
    }
    public void getDifficulty(){
        System.out.println("Средняя");
    }
    public void displayInfo() {
        System.out.println("Название " + name);
        System.out.println("Жанр " + genre);
        System.out.println("Рейтинг " + rating);
    }
}
