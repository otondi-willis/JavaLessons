package org.sajourney.JavaLessons.javacollections.queues;

import org.sajourney.JavaLessons.javacollections.lists.Guest;

import java.util.*;

public class ArrayDequeAsStack {

        public static void main(String[] args) {
            Deque<String> messageStack = new ArrayDeque<>();
            messageStack.push("message 1");

            messageStack.push("message 2");

            messageStack.push("message 3");

            messageStack.push("message 4");
            print(messageStack);

            System.out.println(messageStack.pop());
            System.out.println(messageStack.pop());
            print(messageStack);
            messageStack.push("message 5");
            System.out.println(messageStack.peek());
            print(messageStack);


        }
        public static void print(Deque<String> deque){
            System.out.format("%n--Deque Contents--%n");

            int x=0;
            for(String msg : deque){
                System.out.format("%x: %s %s %n", x++,msg,x==1 ? "(Top)":" ");
            }
            System.out.println(" ");


        }




}
