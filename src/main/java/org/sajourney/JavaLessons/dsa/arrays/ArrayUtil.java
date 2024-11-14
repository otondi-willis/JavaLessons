package org.sajourney.JavaLessons.dsa.arrays;

public class ArrayUtil {
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] removeEven(int[] arr){
        int n = arr.length;
        int oddCount=0;

        for(int i=0; i<n;i++){
            if(arr[i]%2!=0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int index = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                result[index]=arr[i];
                index++;
            }
        }
        return result;

    }
    public void arrayDemo(){
        int[] myArray = new int[5];
        printArray(myArray);
    }

    public static void main(String[] args){

        ArrayUtil arrUtil = new ArrayUtil();
        int[] array1 = {3,4,5,6,4};
        printArray(array1);

        int[] result = removeEven(array1);
        printArray(result);
//        arrUtil.printArray();
//        arrUtil.printOddArray(new int[] {3,4,5,6,4});
//        arrUtil.arrayDemo();
    }

}
