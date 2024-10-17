package org.sajourney.JavaLessons.dependency_injection.setter_injection;

public class Controller {
    private static Service service;

    //setter injection
    public void setService(Service service){
        this.service=service;
    }
    public static void main(String[] args){

        service.handleSomething();
    }

}
