package DSA.Array;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {2, -4, 5, -1, 7, 2, -3, -1};
        int current = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
             current = Math.max(arr[i],current+arr[i]);
            System.out.println("cureent "+current);
             max = Math.max(current,max);
            System.out.println(max);
        }
    }
}
