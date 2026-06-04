package PizzaShop.PizzaDecorator.ConcreteDecorator;


import PizzaShop.Pizza.Pizza;
import PizzaShop.PizzaDecorator.Decorator;

public class ExtraCheese extends Decorator {

    public ExtraCheese(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 5.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "with ExtraCheese";
    }
}
