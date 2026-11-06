package encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        //object
        Customers customer = new Customers("grace", 22, false, true, "Reading");

        // Get values
        System.out.println(customer.getName());
        System.out.println(customer.getAge());
        System.out.println(customer.getMale());
        System.out.println(customer.getVeg());
        System.out.println(customer.getHobbies());

        // Set values
        customer.setName("gracelin");
        customer.setAge(23);
        customer.setMale(false);
        customer.setVeg(false);
        customer.setHobbies("Writing, Coding");

        // Get values
        System.out.println(customer.getName());
        System.out.println(customer.getAge());
        System.out.println(customer.getMale());
        System.out.println(customer.getVeg());
        System.out.println(customer.getHobbies());


    }
}