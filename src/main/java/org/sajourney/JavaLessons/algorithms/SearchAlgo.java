package org.sajourney.JavaLessons.algorithms;

import org.w3c.dom.ls.LSOutput;

public class SearchAlgo {
    public String parseContents(String s){
        for(char c:s.toCharArray()){
            System.out.println(c);
        }
        System.out.println();
    }

    public static void main(String[] args){
        String s = "HelloWorld";
        System.out.println(s.contains("lll"));
    }
}
