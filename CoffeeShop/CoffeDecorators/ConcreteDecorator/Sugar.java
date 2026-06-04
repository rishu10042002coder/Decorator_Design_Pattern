package CoffeeShop.CoffeDecorators.ConcreteDecorator;

import CoffeeShop.CoffeDecorators.CoffeeDecorator;
import CoffeeShop.Coffee.Coffee;

public class Sugar extends CoffeeDecorator {

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return this.coffee.getCost()+3.0;
    }
    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " with extra sugar";
    }
}
