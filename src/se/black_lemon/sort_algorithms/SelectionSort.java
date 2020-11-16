package se.black_lemon.sort_algorithms;

public class SelectionSort {


    //This is an implementation of SelectionSort Algorithm.
//      _______________________________________
//     | -10  |  1  | 12 |233 | 22 | -2 | -25 |
//     ---------------------------------------


    //Selection algorithm divides the array into two parts
    //1 - unsorted partition
    //2 - sorted partition.

    //... Selection Algorithm is quadratic, in place and unstable algorithm.


    // lastUnsortedIndex = 6 => this is the last index of the unsorted partition
    // i = 1  => this is an index used to traverse the array from left to right.
    // largestIndex = 0   => this is the index of the larges element in the unsorted partition, initially is 0.

    //after the first step  largest = 1 because 1 > -10 as we compare the two numbers we increase i by 1, when we reach
    // the last index in the unsorted partition i = 6   ,,,, we swap largest with i.



    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();




        int[] intArr = {-10, 1, 12, 233, 22, -2, -25};

        for (int lastUnsortedIndex = intArr.length-1;  lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largestIndex = 0;

            for (int i =1 ; i <= lastUnsortedIndex; i++){
                if (intArr[i] > intArr[largestIndex]){
                    largestIndex = i;

                }

            }

            swap(intArr, largestIndex,lastUnsortedIndex);

        }

        printArray(intArr);


        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.

        System.out.println();
        System.out.println(duration);

    }


    public static void swap(int[] anArray, int a, int b) {

        if (a == b) {
            return;
        }

        int temp = anArray[a];
        anArray[a] = anArray[b];
        anArray[b] = temp;


    }

    public static void printArray(int intArr[]) {
        System.out.println("The sorted Array:");

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + ", ");

        }

    }
}
