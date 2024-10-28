package Observer;

public class DigitalClock extends Observer {
    public DigitalClock(Subject subject) {
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
            System.out.println("DigitalClock time: " 
                + timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond());
        }
    }
}
