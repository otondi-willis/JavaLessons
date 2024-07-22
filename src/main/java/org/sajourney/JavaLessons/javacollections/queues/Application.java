package org.sajourney.JavaLessons.javacollections.queues;

import org.sajourney.JavaLessons.javacollections.lists.Guest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Application {

        public static void main(String[] args) {
            Guest john = new Guest("john", "doe",false);
            Guest maria = new Guest("maria", "carrey", false);
            Guest sonia = new Guest("sonia","amolo",true);
            Guest siri = new Guest("siri","doe",true);

            Queue<Guest> checkinQueue = new ArrayDeque<>();
            checkinQueue.offer(john);
            checkinQueue.offer(maria);
            print(checkinQueue);

            Guest guest = checkinQueue.poll();
            print(checkinQueue);
            System.out.println(guest);


        }
        public static void print(Queue<Guest> queue){
            System.out.format("%n--Queue Contents--%n");

            int x=0;
            for(Guest guest : queue){
                System.out.format("%x: %s %s %n", x++,guest.toString(),x==1 ? "(Head)":" ");
            }
            System.out.println(" ");


        }


}
