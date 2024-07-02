package org.sajourney.JavaLessons;

import java.util.ArrayList;

public class Arraylists {
    public static void main (String[] args){
        //collection = resizable array
        //elements can be added and removed after compilation phase
        // store reference data types

        ArrayList<String> food = new ArrayList<String> ();

        food.add("pizza");
        food.add("orange");

        food.set(0,"sushi");
        food.remove(1);
        food.clear();

        for (int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
