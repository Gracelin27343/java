package DSA.Array;

public class ArrayDemo {
    public static void main(String[] args){
// Static DSA.Array
        int[] age = {20, 32, 44, 10, 12};
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        char[] grades = {'A', 'B', 'C'};
        boolean[] bools = {true, false, true};

        // traverse
        for (int i = 0; i < age.length; i++) {
            System.out.println("Age: " + i + " " + age[i]);
        }

        // Dynamic sized array
        int[] agesDynamic = new int[5];
        String[] namesDynamic = new String[5];

        // traverse dynamic arrays
        for (int j = 0; j < agesDynamic.length; j++) {
            agesDynamic[j] = (j + 1) * 10;
        }

        for (int i = 0; i < agesDynamic.length; i++) {
            System.out.println("Age: " + i + " " + agesDynamic[i]);
        }

        int[] agesDynamics = new int[5];
        for (int num:agesDynamics){
            System.out.println("num" + (num+4));
        }
        for (int num:agesDynamic){
            System.out.println("num" + num);
        }

    }
}
