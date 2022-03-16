package com.company;
import java.util.Comparator;


public class Friend implements Comparable<Friend>{
    public String lastName;
    public String firstName;
    public String phoneNumber;
    public String birthdate;

    public Friend(String lastName, String firstName, String phoneNumber, String birthdate){
        this.birthdate=birthdate;
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNumber=phoneNumber;
    }
    public String toString(){
        return "Friend{" +
                "first name='" + firstName + '\'' +
                ", last name=" + lastName + '\'' +
                ", phone number=" + phoneNumber + '\'' +
                ", birthdate=" + birthdate + '\''+

                '}';
    }


    @Override
    public int compareTo(Friend o) {
        if (this.lastName.equals(o.lastName)){
            return this.firstName.compareTo(o.firstName);
        }else{
            return this.lastName.compareTo(o.lastName);
        }
    }
}
