package CoffeeShop.Coffee.ConcreteCoffee;

import CoffeeShop.Coffee.Coffee;

public class Espresso implements Coffee {

    @Override
    public double getCost() {
        return 5.00;
    }
    @Override
    public String getDescription() {
        return "Espresso";
    }
}
