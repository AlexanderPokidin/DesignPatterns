package com.pokidin.a.strategy;

import com.pokidin.a.strategy.ducks.Duck;
import com.pokidin.a.strategy.ducks.MallardDuck;
import com.pokidin.a.strategy.ducks.ModelDuck;
import com.pokidin.a.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
