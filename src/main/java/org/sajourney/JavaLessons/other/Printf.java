package org.sajourney.JavaLessons.other;

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
        System.out.printf("\n %b", myBoolean);
        System.out.printf("\n %c", myChar);
        System.out.printf("\n %s", myString);
        System.out.printf("\n %d", myInt);
        System.out.printf("\n %f", myDouble);
        System.out.printf("\n This is a format string %d", 123);

        //width
        System.out.printf("\n Hello %10s", myString);

        //precision
        System.out.printf("\n You have this much money %.2f",myDouble);

        //flags - adds an effect to output based on the flag added to format specifier
        //- : left-justify
        //+ : output a plus (+) or minus (-) sign for a numeric value
        //0 : numeric values are zero-padded
        //, : comma grouping separator if numbers > 1000
        System.out.printf("\n You have this much money %20f",myDouble);
        System.out.printf("\n You have this much money %020f",myDouble);
        System.out.printf("\n You have this much money %+20f",myDouble);
        System.out.printf("\n You have this much money %-20f",myDouble);
        System.out.printf("\n You have this much money %,20f",myDouble);


    }
}
