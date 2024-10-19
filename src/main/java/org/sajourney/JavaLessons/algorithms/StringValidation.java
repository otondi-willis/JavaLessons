package org.sajourney.JavaLessons.algorithms;


public class StringValidation {
    public static boolean isUpperCase(String s){
        return s.chars().anyMatch(Character::isUpperCase);
    }
    public static boolean isLowerCase(String s){
        return s.chars().anyMatch(Character::isLowerCase);
    }
    public static void main(String[] args){
        System.out.println(isUpperCase("omera"));
        System.out.println(isLowerCase("omera"));
    }

}
