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
    public static boolean isUppercaseAndLowercaseAndDigit(String s){
        boolean hasUppercase = s.chars().anyMatch(Character::isUpperCase);
        boolean hasLowercase = s.chars().anyMatch(Character::isLowerCase);
        boolean hasDigits = s.chars().anyMatch(Character::isDigit);

        return hasUppercase && hasLowercase && hasDigits;
    }
    public static boolean isUppercaseOrLowercaseOrDigit(String s){
        boolean hasUppercase = s.chars().anyMatch(Character::isUpperCase);
        boolean hasLowercase = s.chars().anyMatch(Character::isLowerCase);
        boolean hasDigits = s.chars().anyMatch(Character::isDigit);

        return hasUppercase || hasLowercase || hasDigits;
    }
    public static boolean isSpecialCharacter(String s){
        return s.chars().anyMatch(ch->!Character.isLetterOrDigit(ch));
    }
    public static void main(String[] args){
        System.out.println(isUpperCase("omEra"));
        System.out.println(isLowerCase("omera"));
        System.out.println(isDigits("omera1"));
        System.out.println(isUppercaseAndLowercaseAndDigit("Omera1"));
        System.out.println(isUppercaseOrLowercaseOrDigit("omera"));
        System.out.println(isSpecialCharacter("omera@"));

    }

}
