package Assignment4.WithoutState;

enum VendingMachineState {
    IDLE,
    DISPLAY_ENTERED_AMOUNT,
    WAITING_FOR_SELECTION,
    PRODUCT_SELECTED,
    DISPENSE,
    REFUND_CHANGE
}

public class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        this.currentState = VendingMachineState.IDLE;
    }

    public void insertCoin() {
        if (currentState == VendingMachineState.IDLE) {
            System.out.println("Coin inserted. Displaying the entered amount.");
            currentState = VendingMachineState.DISPLAY_ENTERED_AMOUNT;
        } else {
            System.out.println("Cannot insert coin. Machine is not idle.");
        }
    }

    public void selectProduct() {
        if (currentState == VendingMachineState.DISPLAY_ENTERED_AMOUNT) {
            System.out.println("Product selected. Waiting to dispense.");
            currentState = VendingMachineState.PRODUCT_SELECTED;
        } else if (currentState == VendingMachineState.IDLE) {
            System.out.println("Insert a coin first.");
        } else {
            System.out.println("Cannot select product at this stage.");
        }
    }

    public void dispenseProduct() {
        if (currentState == VendingMachineState.PRODUCT_SELECTED) {
            System.out.println("Dispensing the product.");
            currentState = VendingMachineState.DISPENSE;
        } else {
            System.out.println("Cannot dispense. Product not selected yet.");
        }
    }

    public void refundChange() {
        if (currentState == VendingMachineState.DISPLAY_ENTERED_AMOUNT ||
                currentState == VendingMachineState.PRODUCT_SELECTED) {
            System.out.println("Refunding the change.");
            currentState = VendingMachineState.REFUND_CHANGE;
        } else {
            System.out.println("No change to refund.");
        }
    }

    public void reset() {
        System.out.println("Resetting the machine to idle state.");
        currentState = VendingMachineState.IDLE;
    }

    public void displayState() {
        System.out.println("Current State: " + currentState);
    }
}