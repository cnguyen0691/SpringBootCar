package com.example.springboot304car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run (String... strings) throws Exception{
        Car car = new Car(2018,"Toyota","Camry");
        repository.save(car);
        car = new Car(2019, "Honda", "Civic");
        repository.save(car);
        car= new Car(2020,"BMW", "A4");
        repository.save(car);
    }
}
