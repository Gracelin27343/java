public class Operators {
    public static void main(String[] args) {

        //arithmetic operator
        int a = 100;
        int b = 200;

        // + ops
        System.out.println("A + B = " + (a + b));
        // - ops
        System.out.println("A - B = " + (a - b));
        // / ops
        System.out.println("B / A = " + (b / a));
        // * ops
        System.out.println("B * A = " + (b * a));
        // % ops
        System.out.println("B % A = " + (b % a));

        //relation operator
        int c = 50000;
        int d = 23000;

        int x = 1;
        int y = 1;

        System.out.println("A > B = " + (c > d)); // true
        System.out.println("A < B = " + (c < d)); // false
        System.out.println("A >= B = " + (c >= d)); // true
        System.out.println("A <= B = " + (c <= d)); // false
        System.out.println("X == Y = " + (x == y)); // true
        System.out.println("A != B = " + (c != d)); // true

        //logical operator
        int salaryExpected = 50000;
        int salaryOffered = 25000;
        boolean isNightShift = true;

        System.out.println("Salary offered is greater than expected and it's a night shift: " + (salaryOffered > salaryExpected && isNightShift));

        if (false || true) {
            System.out.println("I will accpect the job offer");
        } else {
            System.out.println("I will VIP");
        }

        System.out.println("Whats not ? " + isNightShift);
        System.out.println("Whats not ? " + !isNightShift);
    }
}
