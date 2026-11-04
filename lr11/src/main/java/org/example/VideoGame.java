package org.example;

public class VideoGame extends Game {
    private String platform;

    public VideoGame(String name, String genre, double rating, String platform) {
        super(name, genre, rating);
        this.platform = platform;
    }

    public String getPlatform() {return platform;}
    public void setPlatform(String p) {platform = p;}

    @Override
    public void getDifficulty(){
        System.out.println("Разная пусть будет");
    }

    public void play(String mode, String platform){
        System.out.println("Играю в режием"+ mode +" на платформе "+platform );
    }
}
