package org.sajourney.JavaLessons.algorithms;

public class NormalizeString {
    public static String normalizedString(String s){
        return s.toLowerCase().trim().replace(",","");


    }
    public static void main(String[] args){
        System.out.println(normalizedString("my name is WILLIS, OTONDI"));
    }
}
