package Assignment4.WithState;

import Assignment4.WaitingForSelectionState;

public class VendingMachineDemo {
    public static void main(String[] args) {
        Context context = new Context();
        
        //NORMAL FLOW
        IdleState idleState = new IdleState();
        idleState.doAction(context);
        System.out.println(context.getState());

        DisplayAmountState displayAmountState = new DisplayAmountState();
        displayAmountState.doAction(context);
        System.out.println(context.getState());

        WaitingForSelectionState waitingForSelectionState = new WaitingForSelectionState();
        waitingForSelectionState.doAction(context);
        System.out.println(context.getState());

        ProductSelectedState productSelectedState = new ProductSelectedState();
        productSelectedState.doAction(context);
        System.out.println(context.getState());

        DispenseState dispenseState = new DispenseState();
        dispenseState.doAction(context);
        System.out.println(context.getState());

        RefundChangeState refundChangeState = new RefundChangeState();
        refundChangeState.doAction(context);
        System.out.println(context.getState());


        // //CANCELLED AFTER WAITING FOR SELECTION
        // IdleState idleState = new IdleState();
        // idleState.doAction(context);
        // System.out.println(context.getState());

        // DisplayAmountState displayAmountState = new DisplayAmountState();
        // displayAmountState.doAction(context);
        // System.out.println(context.getState());

        // WaitingForSelectionState waitingForSelectionState = new WaitingForSelectionState();
        // waitingForSelectionState.doAction(context);
        // System.out.println(context.getState());

        // System.out.println("Customer cancelled the transaction.");

        // RefundChangeState refundChangeState = new RefundChangeState();
        // refundChangeState.doAction(context);
        // System.out.println(context.getState());
    }
}
