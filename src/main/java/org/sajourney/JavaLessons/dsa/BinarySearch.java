package org.sajourney.JavaLessons.dsa;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,7,9,11,13};
        int target = 13;
        
        int result = binarySearch(nums, target,0,nums.length - 1 );

        if(result != -1){
            System.out.println("Element found at Index :" + result);
        } else{
            System.out.println("Element not found");
        }

    }

    private static int binarySearch(int[] nums, int target, int left, int right) {
        int steps = 0;
//        int left = 0;
//        int right = nums.length - 1;
        if (left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                return binarySearch(nums, target, mid+1, right);

            } else {
                return binarySearch(nums, target, left, mid -1);
            }

        }
//        while(left<=right){
//            steps++;
//            int mid = (left + right)/2;
//            if(nums[mid] == target){
//                System.out.println("Binary search steps" + steps);
//                return mid;
//            } else if(nums[mid] < target){
//                left = mid + 1;
//
//            } else {
//                right = mid - 1;
//            }
//
//
//        }

        System.out.println("Binary search steps" + steps);
        return -1;
    }
}
