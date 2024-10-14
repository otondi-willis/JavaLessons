package org.sajourney.JavaLessons.other;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
        Random random = new Random();
        int x = random.nextInt(6);

        System.out.println(x);
    }
}
