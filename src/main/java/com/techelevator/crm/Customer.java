package com.techelevator.crm;

import com.techelevator.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Customer extends Person {

    private List<String> pets = new ArrayList<>();
    private String phoneNumber;

public Customer(String firstName, String lastName, String phoneNumber) {
    super(firstName, lastName);

this.phoneNumber = phoneNumber;


}

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);

       new Customer(firstName, lastName, "");


    }

    public List<String> getPets() {
        return pets;
    }

    public void setPets(List<String> pets) {
        this.pets = pets;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
