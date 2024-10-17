package org.sajourney.JavaLessons.dependency_injection.without_DI;

public class Controller {
    private static Service service;
    public static void main(String[] args){
     service.handleSomething();
    }

}
