package se.black_lemon.problems_easy;

public class SortingChallengeOne {


    //Modify the merge sort algorithm so that it sorts integers in DESCENDING order
    //


    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);
        System.out.println("----------------------------------");

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " | ");

        }
        System.out.println("\n" + "----------------------------------");

    }

    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] >= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            if (input[i] >= input[j]) {
                temp[tempIndex] = input[i];
                i++;
                tempIndex++;
            } else temp[tempIndex++] = input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }
}
