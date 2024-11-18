import java.util.ArrayList;

public class Meal {
    private final ArrayList<Item> items;
    private float discount;

    public Meal(){
        items = new ArrayList<Item>();
        this.discount = 1.00f;
    }

    public Meal(float discount) {
        items = new ArrayList<Item>();
        if(discount>=0 && discount<=1) this.discount = discount;
        else {
            this.discount = 1;
            System.out.println("Please enter discount between 0 and 1");
        }
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount){
        if(discount>=0 && discount<=1) this.discount = discount;
        else System.out.println("Please enter discount between 0 and 1");
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return discount*cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}