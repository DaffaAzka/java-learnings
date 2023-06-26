package template;

public class BlockGame extends BlockTemplate {


    @Override
    public int getHeight() {
        return 10;
    }

    @Override
    public int getWidth() {
        return 5;
    }

    @Override
    public String getChar() {
        return "O";
    }

    @Override
    public String getTitle() {
        return "BLOCK GAME";
    }

    @Override
    public String getEndTitle() {
        return "FINISH BLOCK GAME";
    }
}
