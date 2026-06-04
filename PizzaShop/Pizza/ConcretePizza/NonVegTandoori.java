package PizzaShop.Pizza.ConcretePizza;

import PizzaShop.Pizza.Pizza;

public class NonVegTandoori implements Pizza {

    @Override
    public String getDescription() {
        return "Non Veg Tandoori Pizza";
    }
    @Override
    public double getCost() {
        return 10.0;
    }
}
