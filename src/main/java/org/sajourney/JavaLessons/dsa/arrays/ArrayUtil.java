package org.sajourney.JavaLessons.dsa.arrays;

public class ArrayUtil {
  public static void printArray(int[] arr){
      int n = arr.length;
      for(int i=0;i<n;i++){
          System.out.print(arr[i] + " ");
      }
      System.out.println();
  }
    public static int[] reverseArray(int[] arr){
        int n = arr.length-1;
        int count=0;


        for(int i=n;i>=0;i--){
            int[] arra =arr[i];
            System.out.print(arr[i] + " ");
        }
        int[] result = new int[count];
        return result;
    }
  public static void main(String[] args){
      int[] array = new int[] {2,4,3,5,7};
      System.out.println("Print array elements");
      printArray(array);
      System.out.println("Reverse array elements");
      int[] result = reverseArray(array);
      printArray(result);
  }

}
