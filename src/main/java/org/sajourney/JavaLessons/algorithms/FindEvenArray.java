package org.sajourney.JavaLessons.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

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

    public static int[] findEvenNum2(int[] arr1, int[] arr2){
        IntPredicate isEvenPred = num -> num % 2 ==0;
        return Stream.of(arr1,arr2)
                .flatMapToInt(Arrays::stream)
                .filter(isEvenPred)
                .toArray();
    }
    public static void main (String[] args){

    }
}
