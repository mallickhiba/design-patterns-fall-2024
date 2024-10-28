package Observer;

public class AnalogClock extends Observer {
    public AnalogClock(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        draw();
    }

    public void draw() {
        if (subject instanceof ClockTimer) {
            ClockTimer timer = (ClockTimer) subject;
            System.out.println("AnalogClock time: " 
                + timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond());
        }
    }
}

