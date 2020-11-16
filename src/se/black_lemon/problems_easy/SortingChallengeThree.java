package se.black_lemon.problems_easy;

//SOrt the following values using radix sort "bcdef" , "dbaqc", "abcde", "omadd" , "bbbbb"


public class SortingChallengeThree {

    public static void main(String[] args) {

        //init the Array with given values
        String[] stringArr = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};



        radixSort(stringArr, 26 , 5 );
        for (int i = 0; i < stringArr.length; i++) {
            System.out.println (stringArr[i]);
        }
    }


    public static void radixSort(String[] input, int radix, int width) {
        for (int i = width - 1 ; i >= 0 ; i--) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value: input) {
            countArray[getIndex(position, value)]++;
        }
        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, input[tempIndex])]] =
                    input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }

    }



    public static int getIndex(int position, String value){
        //letters are numeric values under the cover  lowercase a = 97 A = 65
        return value.charAt(position) - 'a';
    }
}