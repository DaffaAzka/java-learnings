package subjects.inheritance.supers;

public class Rectangle extends Shape {
    @Override
    public Integer getCorner() {
        return 3;
    }

    public Integer getParentCorner() {
        return super.getCorner();
    }
}
