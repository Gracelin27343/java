package DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list {
    public static void main(String[] args){
        // DSA.Array Creation
        // Technique 1: Dynamic Size (Mutable) (Recommended)
        List<String> names = new ArrayList<>();

        // add data
        names.add("Vishnu");
        names.add("Gokul");
        names.add("Prakash");
        System.out.println(names.get(0));

        // Remove Item
        names.remove(0);
        System.out.println(names.get(0));

        // Replace or Update value
        names.set(0, "Gokula Krishnan");
        System.out.println(names.get(0));

        for (String name : names) {
            System.out.println("Name = " + name);
        }

        // Technique 2: Fixed Size (Immutable) (Cannot Remove or add elements)
        List<String> movies = Arrays.asList("Jailer2", "Mookuthi Amman 2");

        // add data
        movies.remove(1);
        movies.add("Scene");
        System.out.println(movies.get(1));

        // Technique 3: Fixed Size (Immutable)
        List<String> vehicles = List.of("Tata Punch", "Tata Altroz");

        // add data
        vehicles.add("Scene");
        vehicles.add("Scene");
        System.out.println(vehicles.get(2));
    }
}
