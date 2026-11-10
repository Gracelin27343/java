public class Recursion {

    public void iteration(int N) {
        for(int i = N; i > 0; i--) {
            System.out.println(i);
        }
    }

    public void recurssion(int N) {
        System.out.println(N);
        if (N == 1) return;
        recurssion(N - 1);
    }

    public void recursion(int N) {
        System.out.println(N);
        if (N == 10) return;
        recursion(N + 1);
    }

    public static void main(String[] args) {
        Recursion r = new Recursion();

        // 1. Print 1->10 using Iteration
        r.iteration(10);

        // 2. Print 10 -> 1 using recurssion
        r.recurssion(10);

        // 2. Print 1 -> 10 using recurssion
        r.recursion(0);


    }
}