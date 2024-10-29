package Patterns.Assignment1.Builder;
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
    @Override public abstract float price();
    @Override public abstract String name();
}
