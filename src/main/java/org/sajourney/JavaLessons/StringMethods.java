package org.sajourney.JavaLessons;

public class StringMethods {
    public static void main (String[] args){
        String name = "Willis";

        boolean result = name.equals("Willis");
        System.out.println(result);
        boolean result1 = name.equalsIgnoreCase("willis");
        System.out.println(result1);
        boolean result2 = name.equals("willis");
        System.out.println(result2);

//        char result3 = name.charAt('m');
//        String result4 = name.toUpperCase();
//        String result5 = name.toLowerCase();
//        String result6 = name.trim();
//        boolean result7 = name.isEmpty();
        String result8 = name.replace("i", "a");



        int length = name.length();
        System.out.println(length);
        System.out.println(result8);

    }
}
