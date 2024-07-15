package org.sajourney.JavaLessons.datastructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        //implementations: HashMap, TreeMap, LinkedHashMap

        Map fruitCalories = new HashMap();
        fruitCalories.put("apple",95);
        fruitCalories.put("lemon",20);
        fruitCalories.put("banana",105);
        fruitCalories.put("orange",45);
        fruitCalories.put("lemon",50);
        fruitCalories.put("lemon",70);// overrides existing value
        fruitCalories.remove("lemon");

        System.out.println("=====================================");
        fruitCalories.forEach((k,v)-> System.out.println(k + ":" + v));

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories.containsKey("lemon"));
        System.out.println(fruitCalories.containsValue(95));
        //Map.of() allows creation of immutable map of key value pairs in one statement


        System.out.println(fruitCalories);
        System.out.println("banana " + fruitCalories.get("banana"));


    }
}
