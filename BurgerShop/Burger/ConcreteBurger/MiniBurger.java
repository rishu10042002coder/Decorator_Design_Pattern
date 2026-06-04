package BurgerShop.Burger.ConcreteBurger;

import BurgerShop.Burger.Burger;

public class MiniBurger implements Burger {

    @Override
    public String getDescription() {
        return "Mini Burger";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
