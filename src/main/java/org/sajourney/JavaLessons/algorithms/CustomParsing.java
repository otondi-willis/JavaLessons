package org.sajourney.JavaLessons.algorithms;

public class CustomParsing {
    public static boolean isAtEvenIndex(String s, char item){
        if(s == null || s.isEmpty()){
            return false;
        }
        for(int i=0; i<s.length()/2+1;i+=2){
            if (s.charAt(i)==item){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String s = "Hello";
        System.out.println(isAtEvenIndex(s,'H'));
        System.out.println(isAtEvenIndex(s,'e'));
        System.out.println(isAtEvenIndex(s,'l'));
        System.out.println(isAtEvenIndex(s,'o'));
        System.out.println(isAtEvenIndex(null,'H'));


    }
}
