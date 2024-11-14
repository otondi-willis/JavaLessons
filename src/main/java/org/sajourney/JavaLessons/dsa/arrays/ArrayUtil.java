package org.sajourney.JavaLessons.dsa.arrays;

public class ArrayUtil {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void printEvenArray(int[] arr){
        int n = arr.length;
        System.out.println("Even array elements: ");
        for(int i=0; i<n;i++){
            if(arr[i]%2!=0)
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public void arrayDemo(){
        int[] myArray = new int[5];
        printArray(myArray);
    }

    public static void main(String[] args){

        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.printArray(new int[] {3,4,5,6,4});
        arrUtil.printEvenArray(new int[] {3,4,5,6,4});
        arrUtil.arrayDemo();
    }

}
