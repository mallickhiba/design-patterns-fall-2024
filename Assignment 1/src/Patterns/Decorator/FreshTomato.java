package Patterns.Decorator;
class FreshTomato extends ToppingsDecorator{
    Pizza pizza;

    public FreshTomato( Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + " , Fresh Tomato ";
    }

    public int getCost(){
        return pizza.getCost() + 40;
    }
}