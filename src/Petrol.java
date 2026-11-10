public class Petrol {
    //instance variable
    public String color;
    public String type;
    public double price;
    public static final String UNIT = "LITERS";

    // Constructor
    // First method to run when creating object of the class
    public Petrol(String color, String type, double price) {
        this.color = color;
        this.type = type;
        this.price = price;
    }

    // Method: Calculate the price of the petrol
    //syntax
    //[access modifier][specifier][returntype][methodname][(parameters]){ method }

    //instance method - without static keyword
    public double calculatePetrol(int liters) {
        return liters * this.price;
    }


    public static double calculatePetrolPrice(int liters, double price) {
        return liters * price;
    }
 //method overloading
    public static int calculatePetrolPrice(double price,int liters) {
        return liters * (int) price;
    }

}
