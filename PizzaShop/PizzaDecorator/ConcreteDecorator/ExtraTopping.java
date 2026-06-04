package PizzaShop.PizzaDecorator.ConcreteDecorator;

import PizzaShop.Pizza.Pizza;
import PizzaShop.PizzaDecorator.Decorator;

public class ExtraTopping extends Decorator {
    public ExtraTopping(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 4.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "with Extra Topping";
    }
}
