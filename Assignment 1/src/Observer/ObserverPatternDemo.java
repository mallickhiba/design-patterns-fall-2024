package Observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        AnalogClock analogClock = new AnalogClock(timer);
        DigitalClock digitalClock = new DigitalClock(timer);

        // Simulate the clock ticking
        for (int i = 0; i < 5; i++) {
            timer.tick();
            try {
                Thread.sleep(1000); // Wait 1 second between ticks for demo purposes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }   
    } 
}
