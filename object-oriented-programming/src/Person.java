public class Person {
    final String username;
    String age;

    public Person(String username, String age) {
        this.username = username;
        this.age = age;
    }

    public Person(String username) {
        this(username, null);
    }


    void sayHello() {
        System.out.println("Hello " + username);
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
