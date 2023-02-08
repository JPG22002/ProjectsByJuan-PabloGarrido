package com.company;
import java.util.*;
import java.util.ArrayList;

public class Caravan {
    int counter = 0;
    public Caravan(){
        counter++;
    }
    List<Vehicle> vehicleList = new ArrayList<Vehicle>();
    public void addVehicle(Vehicle car){
        vehicleList.add(car);
        try{
            if (vehicleList.size() >10){
                throw new Exception("Too many vehicles added");
            }
        }
        catch(Exception exception){

            System.out.println(exception.getMessage());
        }


    }
    public void cleanCaravan(){
        vehicleList.clear();

    }
    public void sendCar(){
        System.out.println("Where would you like to send this car? New York, Asgard, or Vormir");
        Scanner s = new Scanner(System.in);
        String route = "";
        route= s.nextLine();
        if (route.equalsIgnoreCase("New York")){
            NewYork();
        }else
            if (route.equalsIgnoreCase("Asgard")){
            Asgard();
        }else
            if(route.equalsIgnoreCase("Vormir")){
                Vormir();
            }else
            {
                System.out.println("Wrong input, try again.");
                sendCar();
            }

    }

    public void NewYork(){
    Random rand = new Random();
    int fail = rand.nextInt(10);
    if(fail<2) {
        System.out.println("Caravan fail");

         } else{
            System.out.println("Success Caravan Arrived in New York!");

        }
        cleanCaravan();
    }

    public void Asgard(){
        Random rand = new Random();
        int fail = rand.nextInt(10);
        if(fail<1) {
            System.out.println("Caravan fail");

        } else{
            System.out.println("Success Caravan Arrived in New York!");

        }
        cleanCaravan();
    }

    public void Vormir(){
        Random rand = new Random();
        int fail = rand.nextInt(10);
        if(fail<3) {
            System.out.println("Caravan fail");

        } else{
            System.out.println("Success Caravan Arrived in New York!");

        }
        cleanCaravan();
    }

    public int getCounter() {
        return counter;
    }

}
