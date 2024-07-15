package org.sajourney.JavaLessons.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        //common implementations are linkedlists and priority queues
        // FIFO
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        var removedFruit = fruits.remove();
        System.out.println("Removed fruit is :" + removedFruit );
        System.out.println("head of queue" + fruits.peek());

        System.out.println(fruits);
    }
}
