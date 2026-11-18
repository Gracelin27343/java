package DSA.Array;

public class slidingWindow {

    public static void main(String[] args){
        int[] sw = {2,4,6,7,9,5};

        int n = 3;
        int sum =0;
        int max = 0;
        //first window

        for (int i =0; i< n;i++){
            sum = sum + sw[i];
            //System.out.println(sum);
        }
        max = sum;
        //continuous other windows

        for(int i= n;i <sw.length;i++){

            sum = sum + sw[i] - sw[i-n]; // 12 + 7 - 2 = 17
            //System.out.println(sum);
            //max = Math.max(max,sum);
            if(sum > max){
                max = sum;
                System.out.println(max);
            }

        }

        //System.out.println(max);
    }
}
