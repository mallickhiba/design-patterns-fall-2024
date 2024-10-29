package Patterns.Assignment1.Builder;
public class VegBurger extends Burger{
    @Override
    public float price() {
        return 1.75f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
