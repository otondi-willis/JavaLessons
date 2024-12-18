package org.sajourney.JavaLessons.dsa.arrays;

import static org.sajourney.JavaLessons.dsa.arrays.ArrayFunctions.findSecondMin;

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
    public static void reverseArray(int[] arr,int start, int end){

      while(start<end){
          int temp = arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          start++;
          end--;
      }

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
    public static int[] removeOddElements(int[] arr){
        int n=arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        int[] result = new int[count];
        int idx = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                result[idx]=arr[i];
                idx++;
            }

        }
        return result;


    }
    public static int findMin(int[] arr){
        //edge
        if(arr==null || arr.length == 0 ){
            throw new IllegalArgumentException("Invalid input");
        }
      int min = arr[0];
      for(int i=1;i<arr.length;i++){
          if(arr[i]<min){
              min=arr[i];
          }
      }
      return min;
    }
    public static int findMax(int[] arr){
      //edge
        if(arr==null || arr.length == 0 ){
            throw new IllegalArgumentException("Invalid input");
        }
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int findSecondMax(int[] arr){
      if(arr==null || arr.length==0){
          throw new IllegalArgumentException("Invalid Input");
      }
      int max = Integer.MIN_VALUE;
      int secondMax = Integer.MIN_VALUE;

      for(int i=0; i<arr.length;i++){
          if (arr[i]>max){
              secondMax = max;
              max=arr[i];
          } else if(arr[i]>secondMax && arr[i]!=max){
              secondMax=arr[i];
          }
      }
      return secondMax;
    }
  public static void main(String[] args){
      int[] array = new int[] {0,4,6,0,1,9,3,8,0,2,4,3,5,7};
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

      System.out.println("Remove odd array elements");
      int[] evenElements = removeOddElements(array);
      printArray(evenElements);

      System.out.println("Reversed even array elements");
      int[] reversedEvenElements = reverseArray(evenElements);
      printArray(reversedEvenElements);

      System.out.println("Reverse array elements");
      printArray(array);
      reverseArray(array,0,array.length-1);
      printArray(array);

      int min = findMin(array);
      System.out.println("Minimum value in the array: " + min);
      int max = findMax(array);
      System.out.println("Maximum value in the array: " + max);

      int secondMax = findSecondMax(array);
      System.out.println("Maximum value in the array: " + secondMax);

      int secondMin = findSecondMin(array);
      System.out.println("The second minimum value in the array: " + secondMin);

      System.out.println("Array with zeros moved to the end:");
      ArrayFunctions.moveArrayZeros(array,array.length);
      printArray(array);

      System.out.println("Resized array:");
      int[] resized = ArrayFunctions.resizeArray(array,array.length*2);

      printArray(resized);
      System.out.println(array.length);
      System.out.println(resized.length);




  }

}
