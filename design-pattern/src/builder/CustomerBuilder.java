package builder;

public class CustomerBuilder {

    int id;
    String name;
    String phone;
    String email;
    String address;

    public CustomerBuilder setId(int id) {
        this.id = id;
        return this;

    }

    public CustomerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public CustomerBuilder setEmail(String email) {
        this.email = email;
        return this;

    }

    public CustomerBuilder setAddress(String address) {
        this.address = address;
        return this;

    }

    public Customer build() {
        return new Customer(id, name, phone, email, address);
    }
}
