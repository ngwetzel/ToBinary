package com.techelevator.crm;
import java.util.*;

public class Pet {
    //property declaration zone
    //set vaccinations to be initialized ArrayList
    private String name;
    private String species;
    private ArrayList<String> vaccinations = new ArrayList<String>();
//    private ArrayList<String> vaccinations2 = new ArrayList<String>();
//
//    vaccinations2.add(0,"Rabies");
//    vaccinations2.add(1,"Distemper");
//    vaccinations2.add(2, "Parvo");



    //Constructor
    public Pet (String name, String species){
        this.name = name;
        this.species = species;
    }


    //Getters
    public String getName(){
        return name;
    }
    public String getSpecies(){
        return species;
    }
    public ArrayList<String> getVaccinations(){
        return vaccinations;
    }


    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setSpecies(String species){
        this.species = name;
    }
    public void setVaccinations(ArrayList<String> vaccinations){
        this.vaccinations = vaccinations;
    }

    //Method(S)
    public String listVaccinations(){
        //return elements of vaccinations (array List) as comma delimited string
        //keep in mind spaces btwn & no trailing

        //create empty an empty ""
        String vaccines = "";
        //loop thru arrayList and add to vaccines string w ","
//        for(String vac : vaccinations){
//            vaccines = vaccines + vaccinations.get(vac);
////            System.out.println(vaccines);
//
//        }
        for(int i = 0; i < vaccinations.size(); i++){
            vaccines = vaccines + vaccinations.get(i);
            System.out.println(vaccines);
        }
        return vaccines;
    }

}
