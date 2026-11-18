package DSA.Array;

public class SubArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        //brute force - time complexity o(n*3)
        for (int s=0;s< arr.length;s++){
            System.out.println("s"+s);
            for (int e=s;e< arr.length;e++){
                System.out.println("e"+e);
                for (int a=s;a<=e;a++){
                    System.out.print(arr[a]);
                }
                System.out.println("");
            }
        }
    }

}
