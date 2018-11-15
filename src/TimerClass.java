package MainSourceforJavabowl;

import java.util.TimerTask;

public class TimerClass extends TimerTask {

    public static int i = 0;

    public void run() {
        if (i == 15) {
            synchronized (Javabowl.obj) {
                Javabowl.obj.notify();
            }
        }
    }
}