package Observer;

import java.util.Scanner;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        AnalogClock analog = new AnalogClock(timer);
        DigitalClock digital = new DigitalClock(timer);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int timeInSeconds = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < timeInSeconds; i++) {
            timer.tick();
            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
