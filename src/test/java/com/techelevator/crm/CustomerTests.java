package com.techelevator.crm;

import org.junit.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerTests {



    //arrange
    //act

    @Test
    public void get_customer_balance(){
        //create new customer
        Customer testCustomer = new Customer("John", "Doe");

        //create a map to test / add services / $$
        Map<String, Double> servicePriceMap = new HashMap<>();
        servicePriceMap.put("walk", 5.00);
        servicePriceMap.put("play", 10.00);
        servicePriceMap.put("haircut", 25.00);
        servicePriceMap.put("bath", 25.00);
        double testTotal = testCustomer.getBalanceDue(servicePriceMap);


        //assert
        Assert.assertEquals(65.0, testCustomer.getBalanceDue(servicePriceMap), 0);

    }

    @Test
    public void create_pets_list(){
        Customer testCustomer = new Customer("John", "Doe", "555-555-5555");
        List<String> testPets = new ArrayList<>();
        testPets.add("cats");
        testPets.add("dogs");
        testPets.add("fish");

        testCustomer.setPets(testPets);

        Assert.assertEquals(testPets, testCustomer.getPets());









    }
}