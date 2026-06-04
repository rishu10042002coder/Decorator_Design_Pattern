package BurgerShop.BurgerDecorator.ConcreteDecorator;

import BurgerShop.Burger.Burger;
import BurgerShop.BurgerDecorator.Decorator;

public class ExtraMayo extends Decorator {
    public ExtraMayo(Burger burger) {
        super(burger);
    }
    @Override
    public String getDescription() {
        return burger.getDescription() + " with extra Mayo";
    }
    @Override
    public double getCost(){
        return burger.getCost() + 2.0;
    }
}
