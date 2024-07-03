package org.sajourney.JavaLessons;

public class Printf {
    /* printf() = an optional method to control, format, and display
                    text to the console window
                    two arguments = format string + (object/variable/value)
                    %[flags] [precision] [width] [conversion-character]
    * */
    public static void main(String[] args){
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Willis";
        int myInt = 50;
        double myDouble = 1000;

        //conversion characters
        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);
        System.out.printf("This is a format string %d", 123);

        //width
        System.out.printf("\n Hello %10s", myString);

        //precision
        System.out.printf("You have this much money %.2f",myDouble);
    }
}
