package com.company;
import java.util.Random;
import java.util.Scanner;

public class Game {
    String name;
    Vehicle car;
    Caravan one = new Caravan();
    Caravan two = new Caravan();
    Caravan three = new Caravan();

    int dog;
    int cat;
    int horse;

    public Game(String name) {
        this.name = name;
        boolean isTrue = true;
        while(isTrue) {


            System.out.println("Do you want a new car or quit");
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();


            if (input.equals("new car")) {
                init();
                dog= dog+dogCounter();
                horse=horse+horseCounter();
                cat=cat+catCounter();
            } else if (input.equals("quit")) {

                isTrue = false;
                summary();
            } else {
                System.out.println("Please try again");

            }
        }
    }
    public void init() {

        Scanner s = new Scanner(System.in);
        String input;

            newCar();
            System.out.println("Which caravan 1,2, or 3?");
            input = s.nextLine();
            if (input.equals("1")) {
                one.addVehicle(car);
            } else if (input.equals("2")) {
                two.addVehicle(car);
            } else {
                three.addVehicle(car);

            }

            System.out.println("Which caravan do you want to send out?");
            input= s.nextLine();
            if(input.equals("1")){
                one.sendCar();
                sendCaravan++;

            }else if(input.equals("2")){
                two.sendCar();
                sendCaravan++;
            }else{
                three.sendCar();
                sendCaravan++;
            }
    }
int sendCaravan = 0;
    public int days(){
        return sendCaravan/3;
    }


    public void newCar(){
        Random rand = new Random();
        int carType = rand.nextInt(4)+1;
        while(true){
            car = new Vehicle(carType);
            System.out.println("A " + car.toString() + " has arrived" );
            break;
        }

    }
    public int dogCounter(){
        return car.dogCounter;
    }
    public int horseCounter(){
        return car.horseCounter;
    }
    public int catCounter(){
        return car.catCounter;
    }

    public void summary(){
        System.out.println("Your name: " + name);
        System.out.println("Number of days in: " + days() );
        System.out.println("Total number of caravans: " + (one.getCounter()+ two.getCounter()+three.getCounter()));
        System.out.println("Total number of animals, broken down by animal type " + "dogs: " +  dog + " horses: " +horse+ " cat:" +cat);
    }
}
