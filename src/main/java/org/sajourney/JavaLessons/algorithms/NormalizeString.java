package org.sajourney.JavaLessons.algorithms;

public class NormalizeString {
    public static String normalizedString(String s){
        String lowerCase = s.toLowerCase();
        String trimmed = lowerCase.trim();
        String normalized = trimmed.replace(",","");

        return normalized;
    }
    public static void main(String[] args){
        System.out.println(normalizedString("my name is WILLIS, OTONDI"));
    }
}
