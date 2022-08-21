
/*
Timer :=        A facility for threads to schedule tasks for future execution in a background thread;

TimerTask :=    A task that can be scheduled for one-time or repeated execution by a Timer
 */

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int counter = 10;

            @Override
            public void run() {
                if(counter > 0){
                    System.out.println(counter + " seconds");
                    counter--;
                }
                else {
                    System.out.println("HAPPY NEW YEAR!!");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(2022,Calendar.DECEMBER,31,23,59,50);
        //timer.schedule(task,3000);
        //timer.schedule(task,date.getTime());
        timer.scheduleAtFixedRate(task,0,1000);
    }
}