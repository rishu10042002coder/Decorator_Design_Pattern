package PizzaShop.Pizza.ConcretePizza;

import PizzaShop.Pizza.Pizza;

public class ClassicBase implements Pizza {

    @Override
    public String getDescription() {
        return "Classic Pizza";
    }
    @Override
    public double getCost() {
        return 5.0;
    }
}
