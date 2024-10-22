package org.sajourney.JavaLessons.algorithms;

import java.util.Arrays;
import java.util.OptionalInt;

public class LinearSearchArrays {
    public static Integer linearSearch(int[] arr, int item){
        for (int current:arr){
            if (current == item){
                return item;
            }
        }
        return null;
    }
    public static OptionalInt linearSearch2(int[] arr, int item){
        return Arrays.stream(arr).filter(x->x==item).findFirst();
    }
    public static void main(String[] args){
        int[] arr={5,9,3,2,2,6,8};

        System.out.println(linearSearch(arr,1));
        System.out.println(linearSearch2(arr,3));

    }
}
