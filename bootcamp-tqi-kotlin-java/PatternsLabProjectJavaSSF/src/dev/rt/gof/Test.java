package dev.rt.gof;

import dev.rt.gof.facade.Facade;
import dev.rt.gof.singleton.SingletonEager;
import dev.rt.gof.singleton.SingletonLazy;
import dev.rt.gof.singleton.SingletonLazyHolder;
import dev.rt.gof.strategy.Behavior;
import dev.rt.gof.strategy.BehaviorAggressive;
import dev.rt.gof.strategy.BehaviorDefensive;
import dev.rt.gof.strategy.BehaviorNormal;
import dev.rt.gof.strategy.Robot;

public class Test {

    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Strategy

        Behavior defensive = new BehaviorDefensive();
        Behavior normal = new BehaviorNormal();
        Behavior aggressive = new BehaviorAggressive();

        Robot robo = new Robot();
        robo.setBehavior(normal);
        robo.mover();
        robo.mover();
        robo.setBehavior(defensive);
        robo.mover();
        robo.setBehavior(aggressive);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrateClient("Reginaldo Teixeira", "86705-778");
    }

}
