package PizzaShop;


import PizzaShop.Pizza.ConcretePizza.ClassicBase;
import PizzaShop.Pizza.Pizza;
import PizzaShop.PizzaDecorator.ConcreteDecorator.ExtraCheese;
import PizzaShop.PizzaDecorator.ConcreteDecorator.ExtraTopping;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new ClassicBase();
        System.out.println(pizza.getDescription()+" Price:"+pizza.getCost());
        pizza = new ExtraCheese(pizza);
        System.out.println(pizza.getDescription()+" Price:"+pizza.getCost());
        pizza = new ExtraTopping(pizza);
        System.out.println(pizza.getDescription()+" Price:"+pizza.getCost());

    }
}
