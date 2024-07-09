package org.sajourney.JavaLessons.datastructures;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args){
        String[] weekdays = new String[7];

        //weekdays[0]= "Monday";
        weekdays = new String[]{"Mon","Tue","Wed"};
        System.out.println(Arrays.toString(weekdays));

        for(String i : weekdays){
            System.out.println(i);
        }

    }
}
