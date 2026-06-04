package CoffeeShop.CoffeDecorators.ConcreteDecorator;

import CoffeeShop.CoffeDecorators.CoffeeDecorator;
import CoffeeShop.Coffee.Coffee;

public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() +" with extra milk";
    }
    @Override
    public double getCost(){
        return this.coffee.getCost()+5.0;
    }
}
