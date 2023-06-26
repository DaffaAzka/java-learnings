package abstract_factory;

public record Game(GameFactory factory) {

    public void start() {
        factory().level().start();
        factory().arena().start();
    }

}
