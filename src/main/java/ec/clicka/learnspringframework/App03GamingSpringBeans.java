package ec.clicka.learnspringframework;

import ec.clicka.learnspringframework.game.GameRunner;
import ec.clicka.learnspringframework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

            var gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();

        }

    }
}
