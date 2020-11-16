package se.black_lemon.sort_algorithms;

public class ShellSort {


    public static void main(String[] args) {
        int[] intArr = {1, 11 ,-1 ,19 , 30 , -17 , 25};



        for( int gap = intArr.length / 2 ; gap > 0; gap/=2){



            for (int i= gap; i < intArr.length; i++){

                int newElement = intArr[i];
                int j = i;
                while(j >= gap && intArr[j - gap ] > newElement){
                    intArr[j] = intArr[j - gap];
                    j -= gap;

                }
                intArr[j] = newElement;
            }


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
