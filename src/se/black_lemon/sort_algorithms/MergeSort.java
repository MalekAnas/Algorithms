package se.black_lemon.sort_algorithms;


public class MergeSort {

    public static void main(String[] args) {
        int[] intArray = {3, -1, 7, 5, -17, -1, 8, 120, 187, 17, 3, 18, 29, 15};

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {

            System.out.print(intArray[i]);

            if (i < intArray.length - 1)
                System.out.print(", ");


        }
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void merge(int   [] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            if (input[i] <= input[j]) {
                temp[tempIndex] = input[i];
                i++;
            } else {
                temp[tempIndex] = input[j];
                j++;
            }
            tempIndex++;
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }

}
