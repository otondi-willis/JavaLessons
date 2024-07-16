package org.sajourney.JavaLessons.datastructures;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        //stores elements by default in ascending order or alphabetical order
        //no duplicity
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(300);
        treeSet.add(47);
        treeSet.add(6);
        treeSet.add(6);

        System.out.println(treeSet);


    }
}
