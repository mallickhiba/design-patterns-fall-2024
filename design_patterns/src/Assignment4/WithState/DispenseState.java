package Assignment4.WithState;

public class DispenseState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Dispensing the product.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Dispense State";
    }
}
