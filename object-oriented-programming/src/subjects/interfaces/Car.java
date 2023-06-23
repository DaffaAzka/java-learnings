package subjects.interfaces;

public interface Car extends HasBrand {

    void drive();

    int getTire();

    default boolean isFull() {
        return true;
    }

}
