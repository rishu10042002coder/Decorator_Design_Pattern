package CoffeeShop.Coffee.ConcreteCoffee;

import CoffeeShop.Coffee.Coffee;

public class Lattee implements Coffee {

    @Override
    public String getDescription() {
        return "Lattee";
    }
    @Override
    public double getCost() {
        return 10.00;
    }
}
