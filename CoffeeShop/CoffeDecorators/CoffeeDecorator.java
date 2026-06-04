package CoffeeShop.CoffeDecorators;

import CoffeeShop.CoffeDecorators.ConcreteDecorator.Milk;
import CoffeeShop.Coffee.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
