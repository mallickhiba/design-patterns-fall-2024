package Mediator;

public class Mediator {
    private Fan fan;
    private PowerSupplier powerSupplier;

    public void press() {
        System.out.println("Button pressed!");
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public void setPowerSupplier(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
    }
}
