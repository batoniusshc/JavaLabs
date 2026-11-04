package org.example;

public class BoardGame extends Game{
    private int players;

    public BoardGame(String name, String genre, double rating, int players) {
        super(name, genre, rating);
        this.players = players;
    }

    public int getPlayers() {return players;}
    public void setPlayers(int p) {players = p;}

    @Override
    public void getDifficulty(){
        System.out.println("Легкая сложность");
    }
    public void play(int level, int players) {
        System.out.println("Играю на уровне " + level
                + " с " + players + " игроками");
    }

}
