package BurgerShop.BurgerDecorator.ConcreteDecorator;

import BurgerShop.Burger.Burger;
import BurgerShop.BurgerDecorator.Decorator;

public class ExtraPatty extends Decorator {

    public ExtraPatty(Burger burger) {
        super(burger);
    }
    @Override
    public String getDescription() {
        return burger.getDescription() + " with extra Patty";
    }
    @Override
    public double getCost(){
        return burger.getCost() + 5.0;
    }
}
