package DSA.Array;

public class slidingwindowfunction  {

    //time complex -o(n*2)
    public static int slidingWindow(int[] n, int k){
        int max = 0;
        int sum=0;
        for (int i=0; i<k;i++ ){
            sum= sum+ n[i];
        }
        max=sum;
        for (int i=k;i<n.length;i++){
            sum=sum+n[k]-n[i-k];
            max=Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[] args){
        int[] n ={4,6,2,8,-1};

        System.out.println(slidingWindow(n,3));
    }

}
