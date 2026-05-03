package com.core.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
    //    @Autowired//Field Injection
    Engine engine;
//    public Car(){
//
//    }
    //@Autowired//constructor injection-(by default)
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Setting Using constructor");
    }
    public Engine getEngine(){
        return engine;
    }
    //setter injection
    @Autowired
    public void setEngine(Engine engine){
        this.engine =  engine;
        System.out.println("Setting engine:setter injection");
    }
    public void start(){
        engine.startEngine();
        System.out.println("Car started");
    }
}
