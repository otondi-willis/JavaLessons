package org.sajourney.JavaLessons.algorithms;

import java.util.ArrayList;

public class FindEvenArray {
    public static int[] findEvenArray(int[] arr1, int[] arr2){
        ArrayList<Integer> result = new ArrayList<>();

        for (int num:arr1){
            if(num%2 == 0){
                result.add(num);
            }
        }
        for (int num:arr2){
            if(num%2 == 0){
                result.add(num);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();

    }
    public static void main (String[] args){

    }
}
