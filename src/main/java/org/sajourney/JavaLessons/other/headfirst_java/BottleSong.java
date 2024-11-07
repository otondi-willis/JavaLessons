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
    public void chorus(){
        System.out.println("Ten green bottles sitting on the wall,\n Ten green bottles sitting on the wall, \n And if one green bottle should accidentally fall,\n There'll be nine green bottles sitting on the wall. ");



    }
    public static void main(String[] args){
        int bottles = 10;
        BottleSong chorus = new BottleSong();
        System.out.println("Ten Green Bottles Song Lyrics");
        for(int i=0;i<bottles ; i++){
            chorus.chorus();
        }




    }
}
