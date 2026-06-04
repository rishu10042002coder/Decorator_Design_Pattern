package CoffeeShop;

import CoffeeShop.CoffeDecorators.ConcreteDecorator.CoffeePowder;
import CoffeeShop.CoffeDecorators.ConcreteDecorator.Milk;
import CoffeeShop.Coffee.Coffee;
import CoffeeShop.Coffee.ConcreteCoffee.BlackCoffee;

public class CoffeeMachine {
    public static void main(String[] args){
        Coffee coffee = new BlackCoffee();
        System.out.println(coffee.getDescription()+" Price:"+coffee.getCost());

        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription()+" Price:"+coffee.getCost());
        coffee = new CoffeePowder(coffee);
        System.out.println(coffee.getDescription()+" Price:"+coffee.getCost());


    }
}
