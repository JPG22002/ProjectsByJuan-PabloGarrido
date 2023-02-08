package com.company;


public class Dog extends Animal{
        boolean leash;
        int pottyTime;


        public Dog(String name, double weight, int ID, String owner, boolean leash, int pottyTime){
            super( name,  weight,  ID, owner);
            this.leash = leash;
            this.pottyTime= pottyTime;



        }

    }

