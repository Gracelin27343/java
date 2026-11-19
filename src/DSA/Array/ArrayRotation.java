package DSA.Array;

//O(n*k)
public class ArrayRotation {
    public static int[] rotateArray(int[] input, int k) {
        int N = input.length;

        for (int i = 0; i < k; i++) {
            int previous = input[N - 1];//5

            for (int j = 0; j < N; j++) {
                int temp = input[j]; //1
                input[j] = previous; //5
                previous = temp; //1
            }

        }

        return input;
    }
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        int k = 3 % input.length;
        int[] output = rotateArray(input, k);

        for(int x : output) {
            System.out.println(x);
        }
    }
}
