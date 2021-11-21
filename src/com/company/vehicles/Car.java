package com.company.vehicles;
import com.company.professions.Driver;
import com.company.details.*;

public class Car 
{
    String brand;
    String car_class;
    int weight;
    Driver driver;
    Engine engine;
    public void car (String brand, String car_class, int weight, Driver driver, Engine engine) {
        this.brand=brand;
        this.car_class=car_class;
        this.weight=weight;
        this.driver=driver;
        this.engine=engine;
    }
    // void Brand(String brand){
    //     this.brand=brand;
    // }
    // void Car_class (String car_class){
    //     this.car_class=car_class;
    // }
    // void Weight(String weight){
    //     this.weight=weight;
    // }
    // void Driver (String driver){
    //     this.driver=driver;
    // }
    // void Engine (String engine){
    //     this.engine=engine;
    // }

    public void start() {
        System.out.println("start");
    }
    public void stop() {
        System.out.println("stop");
    }
    public void turnRight(){
        System.out.println("turnRight");
    } 
    public void turnLeft(){
        System.out.println("turnLeft");
    }
    public String toString() {
        return brand+car_class+weight+engine+driver;
    }  
}

