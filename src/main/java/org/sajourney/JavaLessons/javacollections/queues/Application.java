package org.sajourney.JavaLessons.javacollections.queues;

import org.sajourney.JavaLessons.javacollections.lists.Guest;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Application {

        public static void main(String[] args) {
            Guest john = new Guest("john", "doe",false);
            Guest maria = new Guest("maria", "carrey", false);
            Guest sonia = new Guest("sonia","amolo",true);
            Guest siri = new Guest("siri","doe",true);



        }
        public static void print(Queue<Guest> queue){
            System.out.format("%n--Queue Contents--%n");


        }


}
