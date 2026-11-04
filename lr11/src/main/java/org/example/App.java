package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Game game = new Game(
                "Обычная игра",
                "Разное",
                7.0
        );

        BoardGame boardGame = new BoardGame(
                "Монополия",
                "Экономическая",
                8.2,
                4
        );

        VideoGame videoGame = new VideoGame(
                "Minecraft",
                "Песочница",
                9.0,
                "PC"
        );

        System.out.println("Перегрузка методов ");

        game.play();
        game.play(3);
        game.play("Одиночный");

        boardGame.play(2, 4);
        videoGame.play("Онлайн", "PC");

        System.out.println();
        System.out.println("Переопределение методов");

        Game[] games = {
                game,
                boardGame,
                videoGame
        };

        for (Game item : games) {
            item.displayInfo();
            item.getDifficulty();
            System.out.println();
        }
    }
}
