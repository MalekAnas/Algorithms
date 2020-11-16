package se.black_lemon.problems_easy;


//Change the insertion sort algorithm so it becomes recursive algorithm.

public class SortingChallengeTwo {


    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};


        insertionSort(intArray, intArray.length);
//

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " | ");
        }
    }


    public static void insertionSort(int[] arr, int n ) {

        // Base case
        if (n <= 1)
            return;

        // Sort first n-1 elements
        insertionSort( arr, n-1 );

        // Insert last element at its correct position
        // in sorted array.
        int last = arr[n-1];
        int j = n-2;

    /* Move elements of arr[0..i-1], that are
      greater than key, to one position ahead
      of their current position */
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;







    }
}
