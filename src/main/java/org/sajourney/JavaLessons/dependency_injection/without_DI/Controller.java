package org.sajourney.JavaLessons.dependency_injection.without_DI;

public class Controller {
    private static Service service;

    //constructor injection
    public Controller(Service service){
        this.service = service;
    }
    public static void main(String[] args){
     service.handleSomething();
    }

}
