package org.sajourney.JavaLessons.javacollections.creatingcollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        /*
         * use the most abstract type possible for the type of your object
         * for easier implementation switch without challenges
         * */
        Collection<String> c = new ArrayList<>();
        c.add("snowboard");
        c.add("linux");
        c.add("books");
        c.add("snowboard");

        /*
        * another way of collection creation
        * each collection implementation has a conversion constructor that
        * accepts another collection as an argument*/

        Collection<String> favoriteThings = new HashSet<>(c);

        System.out.println(favoriteThings);


    }
}
