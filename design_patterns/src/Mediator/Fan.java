package Mediator;

public class Fan {
    Mediator mediator;
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void turnOn(){

        mediator.start();
        isOn = true;
        System.out.println("Fan is on!");

    }
    public void turnOff(){
        isOn = false;
        System.out.println("Fan is off!");
        mediator.stop();
        
    }
}
