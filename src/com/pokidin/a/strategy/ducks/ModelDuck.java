package com.pokidin.a.strategy.ducks;

import com.pokidin.a.strategy.fly.FlyNoWay;
import com.pokidin.a.strategy.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
