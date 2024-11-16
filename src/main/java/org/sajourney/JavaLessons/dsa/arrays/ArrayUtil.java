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

            count++;
        }
        int[] result = new int[count];
        int idx = 0;
        for(int i=n; i>=0;i--){
            result[idx] = arr[i];
            idx++;
        }
        return result;
    }
    public static int[] removeEvenElements(int[] arr){
      int n=arr.length;
      int count = 0;
      for(int i=0;i<n;i++){
          if(arr[i]%2!=0){
              count++;
          }
      }
      int[] result = new int[count];
      int idx = 0;
      for(int i=0;i<n;i++){
          if(arr[i]%2!=0){
              result[idx]=arr[i];
              idx++;
          }

      }
      return result;


    }
  public static void main(String[] args){
      int[] array = new int[] {4,6,1,9,3,2,4,3,5,7};
      System.out.println("Print array elements");
      printArray(array);
      System.out.println("Reverse array elements");
      int[] reversedArray = reverseArray(array);
      printArray(reversedArray);
      System.out.println("Remove even array elements");
      int[] oddElements = removeEvenElements(array);
      printArray(oddElements);
      int[] oddElementsReversed = reverseArray(oddElements);
      System.out.println("Odd elements array reversed");
      printArray(oddElementsReversed);
  }

}
