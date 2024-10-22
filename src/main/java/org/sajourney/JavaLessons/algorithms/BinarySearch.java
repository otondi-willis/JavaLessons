package org.sajourney.JavaLessons.algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static boolean binarySearch(int[] arr, int item){
        int min = 0;
        int max = arr.length-1;

        while(min <= max){
            int mid = (max+min)/2;
            if(item==arr[mid]){
                return true;

            }else if (item<arr[mid]){
                max = mid - 1;
            } else {
                min = mid +1;
            }


        }
        return false;
    }


    public static void main (String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr,9));

        System.out.println(Arrays.binarySearch(arr,2));

    }
}
