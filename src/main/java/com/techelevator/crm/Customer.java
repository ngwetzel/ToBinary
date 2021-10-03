package com.techelevator.crm;

import com.techelevator.Person;
import com.techelevator.Billable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {

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

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double totalBalance = 0.0;
        for(Map.Entry<String, Double> entry : servicesRendered.entrySet()){
            String key = entry.getKey(); //get the key
            totalBalance = totalBalance + servicesRendered.get(key);

        }
        return totalBalance;
    }


}
