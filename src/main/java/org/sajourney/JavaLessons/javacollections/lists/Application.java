package org.sajourney.JavaLessons.javacollections.lists;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Guest john = new Guest("john", "doe",false);
        Guest maria = new Guest("maria", "carrey", false);
        Guest sonia = new Guest("sonia","amolo",true);
        Guest siri = new Guest("siri","doe",true);

        List<Guest> checkinList = new ArrayList<>(100);
        checkinList.add(john);
        checkinList.add(maria);

        print(checkinList);

    }
    public static void print(List<Guest> list){
        System.out.format("%n--List Contents--%n");
        for(int x = 0; x<list.size();x++){
            Guest guest = list.get(x);
            System.out.format("%x: %s %n", x,guest.toString());
        }

    }
}
