package se.black_lemon.problems_easy;

public class ReverseString {

    //Create a function that reverses a given String


    public static void main(String[] args) {


        String name = "malek";

        String kayak = "123456789";
        for (char c:  reverse(kayak)) {

            System.out.print(c);
        }



    }

    public static char[] reverse(String toReverse){

        char[] toReverseArr = toReverse.toCharArray();               //{ M , A , L , E , K }
        char[] reversedArr = new char[toReverse.length()];          // {   ,   ,   ,   ,   }


        for (int i = 0  ; i < toReverse.length() ; i++){

             reversedArr[i] = toReverseArr[(toReverseArr.length-1) - i];

        }

        return reversedArr;
    }
}
