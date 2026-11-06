public class Customer {
    String name;
    int age;
    boolean isPresent;


    //constructor
    public Customer(String name, int age,boolean isPresent) {
        System.out.println("created");
        this.name = name;
        this.age= age;
        this.isPresent = isPresent;
    }
}