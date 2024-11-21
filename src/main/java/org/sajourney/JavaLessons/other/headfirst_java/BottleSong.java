package org.sajourney.JavaLessons.other.headfirst_java;

/*Ten green bottles sitting on the wall,

Ten green bottles sitting on the wall,

And if one green bottle should accidentally fall,

There'll be nine green bottles sitting on the wall.



Nine green bottles sitting on the wall,

Nine green bottles sitting on the wall,

And if one green bottle should accidentally fall,

There'll be eight green bottles sitting on the wall.*/

public class BottleSong {
    public static void chorus(int n){

        System.out.println( n + " green bottles sitting on the wall,\n " +
                n + " green bottles sitting on the wall, \n " +
                "And if one green bottle should accidentally fall,\n " +
                "There'll be " + (n-1) + " green bottles sitting on the wall. ");
        System.out.println();



    }
    public static void main(String[] args){
        int bottles = 10;
        int count = 10;

        System.out.println("Ten Green Bottles Song Lyrics");
        while(bottles > 0 && bottles <=10){
            for(int i=0;i<count ; i++){

               chorus(bottles);
               bottles--;
            }
        }





    }
}
