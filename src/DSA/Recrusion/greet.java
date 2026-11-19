package DSA.Recrusion;


//time & space-O(n)
public class greet {
    static void greet(int n) {
        // Base Condition
        if (n > 10) {
            return;
        }

        // Body
        System.out.println(n);

        // Recurssive method call
        //10-1
        // greet(n - 1);

        //1-10
        greet(n+1);
    }
    public static void main(String[] args) {
       // greet(10);
        greet(1);
    }
}
