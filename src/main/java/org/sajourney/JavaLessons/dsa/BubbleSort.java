package org.sajourney.JavaLessons.dsa;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {6,8,2,5,4,1,9,7};
        int size = nums.length;
        int steps=0;
        int temp = 0;
        System.out.println("Before sorting...");
        for (int num : nums){
            System.out.print(num + " ");
        }
        System.out.println(" ");

        for(int i=0; i<size;i++){

            for(int j=0; j<size-i-1; j++){
                steps++;
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }



        }

        System.out.println("After sorting...");
        for (int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Steps" + steps);


    }
}
