package subjects.interfaces;

public class Tesla implements Car, IsMaintenance{
    @Override
    public void drive() {
        System.out.println("Tesla drive");
    }

    @Override
    public int getTire() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Tesla";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
