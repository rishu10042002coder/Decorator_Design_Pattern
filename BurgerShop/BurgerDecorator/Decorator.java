package BurgerShop.BurgerDecorator;

import BurgerShop.Burger.Burger;

public abstract class Decorator implements Burger {

    protected Burger burger;
    public Decorator(Burger burger) {
        this.burger = burger;
    }
}
