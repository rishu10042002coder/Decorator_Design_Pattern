package BurgerShop.Burger.ConcreteBurger;

import BurgerShop.Burger.Burger;

public class MaharajaBurger implements Burger {

    @Override
    public String getDescription() {
        return "Maharaja Burger";
    }
    @Override
    public double getCost() {
        return 15.0;
    }
}
