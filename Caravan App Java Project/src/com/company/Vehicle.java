package com.company;
import java.util.Random;

public class Vehicle {
    String vehicleType;
    int capacity;
    boolean trailer;
    boolean hasTrailer;
    Animal[] animalList;

    public Vehicle(int typeInput){
        int type = typeInput;
        switch(typeInput)
        {
            case 1:
                vehicleType = "Compact";
                capacity = 2;
                String capacity1 [] = new String [capacity];
                trailer = false;
                break;
            case 2:
                vehicleType = "Mid-Sized";
                capacity = 5;
                String capacity2 [] = new String [capacity];
                trailer = false;
                break;
            case 3:
                vehicleType = "SUV";
                capacity = 10;
                String capacity3 [] = new String [capacity];
                trailer = true;
                break;
            case 4:
                vehicleType = "Truck";
                capacity = 3;
                String capacity4 [] = new String [capacity];
                trailer = true;
                break;

        }

addAnimals();



    }
    String name;
    double weight;
    int ID;
    String owner;
    int pottyTime;
    boolean isTrue;
    int dogCounter;
    int catCounter;
    int horseCounter;

    public void setParameters(){
        Random generate = new Random();
        String[] nameArray = {"John", "Marcus", "Susan", "Henry"};
        name = nameArray [generate.nextInt(4) ];
        owner = nameArray [generate.nextInt(4) ];
        ID = generate.nextInt(100);
        weight=generate.nextDouble()+10;
        pottyTime= generate.nextInt(5);
        isTrue= generate.nextBoolean();

    }

    private void addAnimals (){
        animalList=new Animal[capacity];
        Random rand = new Random();
        Animal current;
        for(int i =0; i<capacity; i++){
            setParameters();
            int answer= rand.nextInt(3);

            switch (answer){
                case 0:
                    current= new Dog( name,  weight, ID ,  owner, isTrue, pottyTime);
                    animalList[i]= current;
                    dogCounter++;
                    break;
                case 1:
                    current= new Cat(name,  weight, ID ,  owner, isTrue, pottyTime);
                    animalList[i]= current;
                    catCounter++;
                    break;
                case 2:
                    current = new Horse(name,  weight, ID ,  owner, isTrue);
                    animalList[i]= current;
                    horseCounter++;
                    break;

            }

        }



    }

    @Override
    public String toString() {
        return vehicleType;
    }
}
