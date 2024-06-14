package ec.clicka.learnspringframework;

import ec.clicka.learnspringframework.game.GameRunner;
import ec.clicka.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        //1: Object Creation
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();

        // 2: Object Creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
