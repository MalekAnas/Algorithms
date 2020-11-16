package se.black_lemon.sort_algorithms;

public class InsertionSort {


    public static void main(String[] args) {


        int[] intArr = {1, 11 ,-1 ,19 , 30 , -17 , 25};

        System.out.println(intArr.length);



        for (int firstUnsortedIndex = 1; firstUnsortedIndex< intArr.length; firstUnsortedIndex++){

            int newElement = intArr[firstUnsortedIndex];
            int i;
            for ( i=firstUnsortedIndex  ; i >0 && intArr[i-1] > newElement ; i --){

                intArr[i] = intArr[i-1];
            }


           intArr[i] = newElement;

        }


        printArray(intArr);

    }



    public static void printArray(int intArr[]) {
        System.out.println("The sorted Array:");

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + ", ");

        }

    }
}
