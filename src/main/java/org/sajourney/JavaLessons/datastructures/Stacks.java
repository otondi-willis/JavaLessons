package org.sajourney.JavaLessons.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args){
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First request");
        stack.push("Second request");
        stack.push("Third request");
        //System.out.println(stack);// LIFO
        System.out.println(stack.peek());
        //System.out.println(stack.pop());
        System.out.println(stack.poll());
    }
}
