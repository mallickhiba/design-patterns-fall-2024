package Assignment4.WithState;

public class ProductSelectedState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Product has been selected. Preparing to dispense.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Product Selected State";
    }
}