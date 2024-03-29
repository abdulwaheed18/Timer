/**
 * 
 */
package waheed.demo.timer;


import java.util.Timer;
import java.util.TimerTask;

/**
 * Simple demo that uses java.util.Timer to schedule a task 
 * to execute once 5 seconds have passed.
 * 
 * @author abdul
 *
 */

public class Reminder {
    Timer timer;

    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(),0, seconds*1000);
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.out.format("Time's up!%n");
            timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(String args[]) {
        new Reminder(5);
        System.out.format("Task scheduled.%n");
    }
}