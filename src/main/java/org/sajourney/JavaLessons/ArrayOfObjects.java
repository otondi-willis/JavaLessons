package org.sajourney.JavaLessons;

public class ArrayOfObjects {
    public static void main(String[] args){
        Food[] refrigerator = new Food[3];
        Food food1 = new Food("Rice");
        Food food2 = new Food("Potato");
        Food food3 = new Food("Minji");
        Food food4 = new Food("Ugali");
        Food food5 = new Food("Cassava");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;
        Food[] refrigerator1 = {food4, food5};


        for(Food i: refrigerator1){
            System.out.println(i.name);
        }
    }
}
