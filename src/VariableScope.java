public class VariableScope {
    public  String a = "Hello";  // instance variable// accessed when oject is cretaed

    public static String b = " full stack batch"; //static variable - Shared by the class

    public void print() {  //accesed when this method is called
        String message = "Tiger Ka huKum!"; // Local variable
        System.out.println(message);
    }

    public static void main(String[] args) {
        String GANGSTER = "SJ Surya"; //global variable

        // Scope  = World
        System.out.println("International" + GANGSTER);

        // // Scope  = India
        if (true) {
            System.out.println("India");
            String HERO = "TIGER MUTHUVEL PANDIAN"; //local variable - accessible only inside its scope
            System.out.println(GANGSTER);
            System.out.println(HERO);

            // Scope = State
            if (true) {
                System.out.println("State");
                String LOCAL_GUNDAS = "2 People";
                System.out.println(GANGSTER);
                System.out.println(HERO);
                System.out.println(LOCAL_GUNDAS);

                // Scope - Town
                if (true) {
                    System.out.println("Town");
                    String LOCAL_HERO = "Murthy Anna";
                    System.out.println(GANGSTER);
                    System.out.println(HERO);
                    System.out.println(LOCAL_GUNDAS);
                    System.out.println(LOCAL_HERO);
                }
            }

        }
    }
}
