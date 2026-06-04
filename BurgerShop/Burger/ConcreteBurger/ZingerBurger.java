package BurgerShop.Burger.ConcreteBurger;

import BurgerShop.Burger.Burger;

public class ZingerBurger implements Burger {

    @Override
    public String getDescription() {
        return "Zinger Burger";
    }
    @Override
    public double getCost() {
        return 10.00;
    }
}
