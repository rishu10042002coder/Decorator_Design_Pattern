package CoffeeShop.Coffee.ConcreteCoffee;

import CoffeeShop.Coffee.Coffee;

public class BlackCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Black Coffee";
    }
    @Override
    public double getCost() {
        return 10.00;
    }
}
