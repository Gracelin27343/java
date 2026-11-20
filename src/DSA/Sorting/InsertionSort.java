package DSA.Sorting;

public class InsertionSort {
        static void insertionSort(int[] arr) {
            int n = arr.length;
            // Start from the second element
            for (int i = 1; i < n; ++i) {
                //current element
                int key = arr[i]; //11

                         //1-1=0
                int j = i - 1; //12 Check elements before the current element
                // Move elements of arr[0..i-1] that are greater than key ahead

                                //12 > 11
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];//12
                    //Moves backwards to check the previous element.
                    j = j - 1;
                }
                arr[j + 1] = key;//11
            }
        }
        static void printArray(int[] arr) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6};

            insertionSort(arr);
            printArray(arr);
        }
    }
