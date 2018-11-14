package sample;
import java.util.TimerTask;
import java.util.Timer;
import java.io.*;
import java.util.*;

class TimerClass extends TimerTask {

    public static int i = 0;
    public void run() {
        if(i == 15) {
            synchronized (Javabowl.obj) {
                Javabowl.obj.notify();
            }
        }
    }
}
