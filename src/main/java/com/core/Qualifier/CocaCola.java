package com.core.Qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CocaCola implements ColdDrink {
    @Override
    public void Drink() {
        System.out.println("Drinking Cocacola");
    }
}
