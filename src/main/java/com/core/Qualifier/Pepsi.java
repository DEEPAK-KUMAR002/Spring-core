package com.core.Qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Pepsi implements ColdDrink {
    @Override
    public void Drink(){
        System.out.println("Drinking pepsi");
    }
}
