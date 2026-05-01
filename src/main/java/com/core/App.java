package com.core;

import com.core.concepts.Car;
import com.core.concepts.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        System.out.println( "Project started" );
        System.out.println("Starting Point");
        ApplicationContext container =new ClassPathXmlApplicationContext("config.xml");
        //container
        Engine engine1= container.getBean("engine1",Engine.class);
        engine1.startEngine();
        System.out.println("------");
        Car car = container.getBean("car",Car.class);
        car.start();
    }
}
