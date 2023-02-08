package com.company;

public class Cat extends Animal {
    boolean litterBox;
    int pottyTime;

    public Cat(String name, double weight, int ID, String owner,boolean litterBox,int pottyTime){
        super(name, weight, ID, owner);
        this.litterBox=litterBox;
        this.pottyTime=pottyTime;
    }


}
