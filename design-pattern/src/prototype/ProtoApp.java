package prototype;

public class ProtoApp {
    public static void main(String[] args) {
        Store store1 = new Store("Y", "Bandung", "Indonesia", "Gadget");
        Store store2 = store1;

        Store store3 = store2.clone();
        store3.setName("Z");

        Store store4 = new Store("A", "Bandung", "Indonesia", "Fashion");
    }
}
