package org.sajourney.JavaLessons.dsa.arrays;

public class ArrayFunctions {
    public static int findSecondMin(int[] arr){
        //edge case check
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("Invalid input");
        }
        int min = Integer.MAX_VALUE;
        int secondMin= Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secondMin = min;
                min = arr[i];
            }else if(arr[i]<secondMin && arr[i]!=min){
                secondMin = arr[i];
            }
        }
        return secondMin;
    }
}
