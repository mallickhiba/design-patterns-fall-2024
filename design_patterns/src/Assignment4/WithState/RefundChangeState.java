package Assignment4.WithState;

public class RefundChangeState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Refunding change to the customer.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Refund Change State";
    }
}