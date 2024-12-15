package Mediator;

public class Main {
    public static void main(String[] args) {

        Mediator mediator = new Mediator();
        Fan fan = new Fan();
        PowerSupplier powerSupplier = new PowerSupplier();
        Button button = new Button();

        fan.setMediator(mediator);
        button.setMediator(mediator);
        mediator.setFan(fan);
        mediator.setPowerSupplier(powerSupplier);

        button.press();
        button.press();
    }
}
