package Patterns.Assignment1.Builder;
public class MealBuilder {
    public Meal prepareNonVegMeal(){
        Meal meal = new Meal(0.85f);
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal prepareVegMeal(){
        Meal meal = new Meal(0.85f);
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
