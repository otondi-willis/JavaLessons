package org.sajourney.JavaLessons;

public class StaticKeyword {
    public static void main(String[] args){
        Friend friend1 = new Friend("Omollo");
        Friend friend2 = new Friend("Peter");
        Friend friend3 = new Friend("Woolly");

        System.out.println(Friend.numberOfFriends);

    }
}
