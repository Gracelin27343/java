package DSA.Sorting;

public class MergeSort {

    public static void mergeSort(int[] array) {

        //dividing all elements
        int length = array.length; //7
        if (length <= 1) return;

        int middle = length / 2; //4-len

        //elments
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        //pointers
        int i = 0;
        int j = 0;

        for (; i < length; i++) {
            if (i < middle) { //copy of neww arr
                leftArray[i] = array[i]; //{8, 2, 5, 3}
            } else {
                rightArray[j] = array[i];//{ 4, 7, 6}
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0;
        int l = 0;
        int r = 0;

        while (l < leftSize && r < rightSize) {
                  // 8 < 2
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r]; //2
                i++;//1
                r++;//1
            }
        }
               //0<1
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {8, 2, 5, 3, 4, 7, 6};

        for (int x : arr)
            System.out.print(x + " ");

        mergeSort(arr);
        System.out.println(" ");
        for (int x : arr)
            System.out.print(x + " ");
    }
}