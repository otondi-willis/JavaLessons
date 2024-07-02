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
            //System.out.println(food.get(i));
        }

        // 2D ArrayList = dynamic list of lists
        // you can change the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<String>();
        drinkList.add("krest");
        drinkList.add("fanta");
        drinkList.add("stoney");
        drinkList.add("sprite");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);


        System.out.println(groceryList.get(0).get(1));

        //Foreach functionality

        for(String i : produceList){
            System.out.println(i);
        }



    }
}
