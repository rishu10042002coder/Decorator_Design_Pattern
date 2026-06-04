package BurgerShop;

import BurgerShop.Burger.Burger;
import BurgerShop.Burger.ConcreteBurger.MaharajaBurger;
import BurgerShop.BurgerDecorator.ConcreteDecorator.ExtraMayo;
import BurgerShop.BurgerDecorator.ConcreteDecorator.ExtraPatty;

public class BurgerShop {
    public static void main(String[] args) {
        Burger burger = new MaharajaBurger();
        System.out.println(burger.getDescription()+" Price:"+burger.getCost());

        burger = new ExtraMayo(burger);
        System.out.println(burger.getDescription()+" Price:"+burger.getCost());
        burger = new ExtraPatty(burger);
        System.out.println(burger.getDescription()+" Price:"+burger.getCost());
    }
}
