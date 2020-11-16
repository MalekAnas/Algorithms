package se.black_lemon.sort_algorithms;

public class MergeSortForLoops {




        static int arr[]={1,3,4,2,-4,-5,3,44,55, 7};

        public static void main (String []args){

            int len = arr.length;

            sort(0,len,arr);

            for(int value : arr){
                System.out.print(value + " ");
            }
            System.out.println("output of mergeSort");


        }




        public static void sort(int start, int end , int[] arra) {




            if (end-start <2) {
                return ;
            }



            int mid = (start + end) / 2;
            System.out.println("start : " + start + " mid : " + mid + " end : " + end);

            sort(start, mid, arra);
            sort(mid, end, arra);

            System.out.println("merging process" +" start : " + start + " mid : " + mid + " end : " + end);
            merge(start,mid,end,arra);



        }



        public static void merge(int start,int mid,int end,int[] arra){

            //temp array
            int[] temp = new int[end-start-1];
            System.out.println("::::::::::::THIS IS TEMP ARR LENGTH::::::::::::");
            System.out.println(":::::::::::::::   " + temp.length+ "   :::::::::::::::");


            for(int value : arra){
                System.out.print(value + " ");
            }
            System.out.println("passed arra values");


            int i = 0;
            int j = 0;

            for(int z =0; z<temp.length && start+i<mid && mid+j<end; z++) {


                if (arra[start+i] <= arra[mid+j]) {
                    temp[z] = arra[start+i];
                    i++;
                } else {
                    temp[z] = arra[mid+j];
                    j++;
                }
            }
            int noOfElementsInTemp=i+j;

            for(int value : temp){
                System.out.print(value + " ");
            }
            System.out.println("temp values");



            if(mid+j==end && start+i<mid){

                while(start+i<mid) {
                    arra[start + i + j] = arra[start + i];
                    i++;
                    System.out.println("performed jumping");
                }


            }




            for(int value : arra){
                System.out.print(value + " ");
            }
            System.out.println("after jumping values");



            for(int f =0;f<noOfElementsInTemp;f++){
                arra[start+f]=temp[f];
            }
            for(int value : arra) {
                System.out.print(value + " ");
            }

            System.out.println("final values");
        }






    }


