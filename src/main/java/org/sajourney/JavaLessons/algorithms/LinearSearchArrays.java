package org.sajourney.JavaLessons.algorithms;

public class LinearSearchArrays {
    public static boolean linearSearch(int[] arr, int item){
        for (int current:arr){
            if (current == item){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={5,9,3,2,2,6,8};

        System.out.println(linearSearch(arr,1));

    }
}
