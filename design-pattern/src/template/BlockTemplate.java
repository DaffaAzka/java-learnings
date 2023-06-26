package template;

public abstract class BlockTemplate {
    public final void start() {
        System.out.println(getTitle());

        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                System.out.print(getChar());
            }
            System.out.print("\n\r");
        }

        System.out.println(getEndTitle());
    }

    public abstract int getHeight();
    public abstract int getWidth();

    public abstract String getChar();
    public abstract String getTitle();
    public abstract String getEndTitle();
}
