/**
 * 
 */
package waheed.demo.timer;

import java.util.Calendar;
import java.util.Date;

/**
 * @author abdul
 *
 */
public class TimeDifference {
    
    public static void main(String args[]) {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Date resultdate = new Date(System.currentTimeMillis());
        calendar2.setTime(resultdate);
        calendar1.setTime(resultdate);
        calendar1.set(Calendar.DAY_OF_MONTH, (calendar1.get(Calendar.DAY_OF_MONTH)-1));
        System.out.print(calendar1.getTime());
        if(calendar1.before(calendar2)) {
            System.out.print(" Is Before ");
        } else {
            System.out.print(" Is After ");
        }
        System.out.print(calendar2.getTime());
    }

}
