package org.sajourney.JavaLessons.algorithms;


public class StringValidation {
    public static boolean isUpperCase(String s){
        return s.chars().anyMatch(Character::isUpperCase);
    }
    public static boolean isLowerCase(String s){
        return s.chars().anyMatch(Character::isLowerCase);
    }
    public static boolean isDigits(String s){
        return s.chars().anyMatch(Character::isDigit);
    }
    public static boolean
    public static void main(String[] args){
        System.out.println(isUpperCase("omEra"));
        System.out.println(isLowerCase("omera"));
        System.out.println(isDigits("omera1"));
    }

}
