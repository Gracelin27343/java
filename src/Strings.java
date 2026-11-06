public class Strings {
    public static void main(String[] args) {
        String movieOne = "Jailer1";
        String movieTwo = "Jailer1";


//string literals
        // ==
        // It will check the reference equality
        if(movieOne == movieTwo) {
            System.out.println("Both strings are the same");
        } else {
            System.out.println("Not same");
        }

        //string object
        // equals()
        // it will check the value equality
        String movieA = new String("Balan");
        String movieB = new String("Balan");

        // Reference equality
        if(movieA == movieB) {
            System.out.println("Both strings are the same");
        } else {
            System.out.println("Not same");
        }

        // Value equality
        if(movieA.equals(movieB)) {
            System.out.println("Both strings have the same value");
        } else {
            System.out.println("Different values");
        }
    }
}
