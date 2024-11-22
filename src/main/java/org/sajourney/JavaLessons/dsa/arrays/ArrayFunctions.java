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
    public static void moveArrayZeros(int[] arr, int n){
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("Invalid Input");
        }
        int j=0;
        for(int i=0;i<n;i++){// focus on non zero elements
            if(arr[i]!=0 & arr[j]==0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }

        }

    }

    public static void moveZerosToStart(int[] arr, int n){
    if(arr==null || arr.length==0){
        throw new IllegalArgumentException("Invalid Input");
    }
    int j=0;
    for(int i=0;i<n;i++){// focus on non zero elements
        if(arr[i]!=0 & arr[j]==0){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
        }
        if(arr[j]!=0){
            j++;
        }

    }

}
    public static int[] resizeArray(int[] arr, int capacity){
        int[] temp = new int [capacity];
        for(int i=0; i<arr.length; i++){
            temp[i]=arr[i];
        }
        return temp;
    }

}
