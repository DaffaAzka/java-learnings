package abstract_factory;

public interface GameFactory {
    Level level();
    Arena arena();
}

class EasyMode implements GameFactory {

    @Override
    public Level level() {
        return new LevelEasy();
    }

    @Override
    public Arena arena() {
        return new ArenaEasy();
    }
}

class MediumMode implements GameFactory {

    @Override
    public Level level() {
        return new LevelMedium();
    }

    @Override
    public Arena arena() {
        return new ArenaMedium();
    }
}

class HardMode implements GameFactory {

    @Override
    public Level level() {
        return new LevelHard();
    }

    @Override
    public Arena arena() {
        return new ArenaEasy();
    }
}
