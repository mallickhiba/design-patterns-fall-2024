public class PizzaStore {
    
    public static void main(String[] args) {
        Pizza pizza = new SimplePizza();
        System.out.println(pizza.getDescription()+ " Cost: "+ pizza.getCost());

        Pizza pizza2 = new ChickenFiesta();
        pizza2 = new FreshTomato(pizza2);
        pizza2 = new Paneer(pizza2);

        System.out.println(pizza2.getDescription()+ " Cost: "+ pizza2.getCost());


    }
}
