public class ArrayDemo {
    public static void main(String[] args) {
        // 1. Create a fixed-size array of 5 integers
        int[] numbers = new int[5];
        // 2. Add data to specific indices (0 to 4)
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        // Print an element to verify
        System.out.println("Element at index 2: " + numbers[3]);

        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        //	at ArrayDemo.main(ArrayDemo.java:12)
        //System.out.println("Element at index 2: " + numbers[6]); // Outputs 30

            // 1. Create a fixed-size array of 5 integers
            int[] number = {1, 2, 3, 4, 5};
            // Print an element to verify
            System.out.println("Element at index 2: " + number[2]); // Outputs 30
        }

    }

