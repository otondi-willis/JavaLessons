package org.sajourney.JavaLessons.dependency_injection.constructor_injection;

public class Controller {
    private static Service service;
    public static void main(String[] args){
     service.handleSomething();
    }

}
