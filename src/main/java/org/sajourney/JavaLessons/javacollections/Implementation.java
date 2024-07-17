package org.sajourney.JavaLessons.javacollections;

public class Implementation implements Contract{
    @Override
    public void term1() {
        System.out.println("implementation: term1");
    }

    @Override
    public void term2() {
        System.out.println("implementation: term2");
    }

    @Override
    public void extendedTerm() {
        System.out.println("implementation: extendedTerm ");
    }
}
