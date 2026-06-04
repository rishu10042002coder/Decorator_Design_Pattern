package PizzaShop.PizzaDecorator.ConcreteDecorator;

import PizzaShop.Pizza.Pizza;
import PizzaShop.PizzaDecorator.Decorator;

public class ExtraSauce extends Decorator {
    public ExtraSauce(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "with Extra sauce";
    }
}
