package waheed.demo.timer;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer to perform a task once per second.
 *
 * @author abdul
 *
 */

public class AnnoyingBeep {
    Toolkit toolkit;
    Timer timer;

    public AnnoyingBeep() {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(),
                       0,        //initial delay
                       1*1000);  //subsequent rate
    }

    class RemindTask extends TimerTask {
        int numWarningBeeps = 3;
        public void run() {
            if (numWarningBeeps > 0) {
                toolkit.beep();
                System.out.format("Beep!%n");
                numWarningBeeps--;
            } else {
                toolkit.beep(); 
                System.out.format("Time's up!%n");
                //timer.cancel(); //Not necessary because
                                  //we call System.exit
                System.exit(0);   //Stops the AWT thread 
                                  //(and everything else)
            }
        }
    }
    public static void main(String args[]) {
        new AnnoyingBeep();
        System.out.format("Task scheduled.%n");
    }

}
