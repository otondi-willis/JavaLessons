package org.sajourney.JavaLessons.javacollections.lists;

import org.sajourney.JavaLessons.datastructures.javacollections.Room;

import java.util.ArrayList;
import java.util.List;

public class Guest {
    private String firstName;
    private String lastName;
    private boolean loyaltyProgramMember;
    private List<Room> preferredRooms = new ArrayList<>();
    public Guest(String firstName,String lastName, boolean loyaltyProgramMember){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.loyaltyProgramMember = loyaltyProgramMember;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
