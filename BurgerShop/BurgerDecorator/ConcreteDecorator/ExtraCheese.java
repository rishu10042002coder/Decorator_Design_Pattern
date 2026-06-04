package BurgerShop.BurgerDecorator.ConcreteDecorator;

import BurgerShop.Burger.Burger;
import BurgerShop.BurgerDecorator.Decorator;

public class ExtraCheese extends Decorator {
    public ExtraCheese(Burger burger) {
        super(burger);
    }
    @Override
    public String getDescription() {
        return burger.getDescription() + " with extra Cheese";
    }
    @Override
    public double getCost(){
        return burger.getCost() + 3.0;
    }
}
