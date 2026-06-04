package PizzaShop.Pizza.ConcretePizza;

import PizzaShop.Pizza.Pizza;

public class VegTandoori implements Pizza {

    @Override
    public String getDescription() {
        return "Veg Tandoori Pizza";
    }
    @Override
    public double getCost(){
        return 7.0;
    }
}
