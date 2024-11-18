package Assignment4.WithState;

public class DisplayAmountState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Amount entered is displayed. Waiting for product selection.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Display Amount State";
    }
}