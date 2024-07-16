package org.sajourney.JavaLessons.datastructures;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        //common implementations are linkedlists and priority queues
        // FIFO
        //ArrayDeque implementation-better performance
        //LinkedList implementation-better if moving current element during iteration
        Queue fruits = new ArrayDeque();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.offer("mango");

        var removedFruit = fruits.remove();
        System.out.println("Removed fruit is :" + removedFruit );
        System.out.println("head of queue" + fruits.peek());

        System.out.println(fruits);
    }
}
