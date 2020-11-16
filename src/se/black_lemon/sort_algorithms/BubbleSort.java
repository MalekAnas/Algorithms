package se.black_lemon.sort_algorithms;

public class BubbleSort {

    public static void main(String[] args) {
        // write your code here


//This is an implementation of BubbleSort Algorithm.
//      _______________________________________
//     | -10  |  1  | 12 |233 | 22 | -2 | -25 |
//     ---------------------------------------

//    We divide the array into two parts *sorted part and unsorted part*


//                       WE START >>>
//    unsortedPartitionIndex = 6 "The last index of the array when we start _  this is the last index of the unsorted partition.
//    i= 0 _ index used to traverse the array from left to right.

//                     WE FINISH >>>

//   unsortedPartitionIndex = 0
//   i= 6  where 6 is the number of elements, in other words the inner loop must iterate all the elements of the array.

//        https://codegym.cc/groups/posts/bubble-sort
//        black_lemon

        long startTime = System.nanoTime();


        int[] intArr = {-10, 1, 12, 233


                , 22, -2, 12};

        for (int unsortedPartitionIndex = intArr.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {

            for (int i = 0; i < unsortedPartitionIndex; i++) {

                if (intArr[i] > intArr[i + 1]) {
                    swap(intArr, i, i + 1);

                }


            }

        }

        printArray(intArr);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.

        System.out.println();
        System.out.println("Duration in millisec: " + duration / 1000000);

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
