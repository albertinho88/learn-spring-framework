package ec.clicka.learnspringframework;

import ec.clicka.learnspringframework.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public MarioGame marioGame() {
        return new MarioGame();
    }

    @Bean
    public SuperContraGame superContraGame() {
        return new SuperContraGame();
    }

    @Bean
    public PacmanGame pacmanGame() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

}
