package Assignment4.WithoutState;

public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.displayState();

        vendingMachine.insertCoin();
        vendingMachine.displayState();

        vendingMachine.selectProduct();
        vendingMachine.displayState();

        vendingMachine.dispenseProduct();
        vendingMachine.displayState();

        vendingMachine.refundChange();
        vendingMachine.displayState();

        vendingMachine.reset();
        vendingMachine.displayState();
    }
}
