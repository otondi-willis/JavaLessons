package org.sajourney.JavaLessons.dsa;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {6,8,2,5,4,1,9,7};


        System.out.println("Before sorting...");
        for (int num : nums){
            System.out.print(num + " ");
        }
        System.out.println(" ");

        for (int i=1;i<nums.length;i++){
            int key = nums[i];
            int j= i -1;

            while((j>=0)&&(nums[j]>key)){
                nums[j+1] = nums[j];
                j--;

            }
            nums[j+1]=key;

            for (int num : nums){
                System.out.print(num + " ");
            }
            System.out.println(" ");

        }

        System.out.println("After sorting...");
        for (int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();



    }
}
