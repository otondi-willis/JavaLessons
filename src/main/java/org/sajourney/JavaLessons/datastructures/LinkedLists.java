package org.sajourney.JavaLessons.datastructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args){
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("Maembe");
        shoppingList.add("Orange");
        shoppingList.add("Banana");

        System.out.println(shoppingList);

        shoppingList.add(1, "Mango");
        System.out.println(shoppingList);

        List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList);
        System.out.println(synchronizedShoppingList);




    }
}
