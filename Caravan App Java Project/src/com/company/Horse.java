package com.company;

public class Horse extends Animal{

    public boolean hay;
    public Horse(String name, double weight, int ID, String owner, boolean hay){
        super (name,  weight,  ID, owner);
        this.hay=hay;


    }
}


