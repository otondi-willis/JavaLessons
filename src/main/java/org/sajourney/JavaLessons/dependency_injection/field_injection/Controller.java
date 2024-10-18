package org.sajourney.JavaLessons.dependency_injection.field_injection;

public class Controller {

    //field injection
    //@Autowired
    private static Service service;

    public static void main(String[] args){
     service.handleSomething();
    }

}
