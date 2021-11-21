package com.company.vehicles;
import com.company.professions.Driver;
import com.company.details.*;

public class SportCar extends Car{
    private int TopSpeed;
        public void sportCar(String brand, String car_class, int weight, Driver driver, Engine engine,int TopSpeed) {
        super(brand, car_class, weight, driver, engine);
        this.TopSpeed=TopSpeed;
    }
    @Override
    public String toString() {
        return super.toString()+TopSpeed;
    }  
}

