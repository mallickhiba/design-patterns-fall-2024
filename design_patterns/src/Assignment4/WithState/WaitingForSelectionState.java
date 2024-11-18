package Assignment4.WithState;

public class WaitingForSelectionState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Waiting for the customer to select a product.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Waiting for Selection State";
    }
}
