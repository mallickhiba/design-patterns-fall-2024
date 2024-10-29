package Observer;
import java.util.Scanner;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        AnalogClock analogClock = new AnalogClock(timer);
        DigitalClock digitalClock = new DigitalClock(timer);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds to tick: ");
        int seconds = scanner.nextInt();


        for (int i = 0; i < seconds; i++) {
            timer.tick();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }
}
