package abstract_factory;

public class AbstractApp {

    public static void main(String[] args) {
        Game game = new Game(new MediumMode());
        game.start();
    }

}
