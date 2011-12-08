package waheed.demo.timer;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Simple demo that uses java.util.Timer to schedule a task to execute
 * once 5 seconds have passed.
 *
 * @author abdul
 *
 */

public class ReminderBeep {
    Toolkit toolkit;
    Timer timer;

    public ReminderBeep(int seconds) {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.out.format("Time's up!%n");
            toolkit.beep();

            //timer.cancel(); //Not necessary because
            //we call System.exit.
            System.exit(0);  
        }
    }

    public static void main(String args[]) {
        new ReminderBeep(5);
        System.out.format("Task scheduled.%n");
    }
}
