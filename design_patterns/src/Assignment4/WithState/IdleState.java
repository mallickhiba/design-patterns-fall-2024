package Assignment4.WithState;

public class IdleState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Vending Machine is idle. Waiting for a coin to be inserted.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Idle State";
    }
}
