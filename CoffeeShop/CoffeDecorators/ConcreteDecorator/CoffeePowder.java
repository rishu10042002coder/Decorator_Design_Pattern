package CoffeeShop.CoffeDecorators.ConcreteDecorator;

import CoffeeShop.CoffeDecorators.CoffeeDecorator;
import CoffeeShop.Coffee.Coffee;

public class CoffeePowder extends CoffeeDecorator {

    public CoffeePowder(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " with extra coffeePowder";
    }
    @Override
    public double getCost(){
        return this.coffee.getCost()+10.0;
    }
}
