package forTest;

import java.sql.Time;
import java.util.Timer;

/**
 * Created by ZLinuxFan on 02.07.2016.
 */
public class Timer_{
    public static void main(String[] args) throws InterruptedException {

        long timeout = System.currentTimeMillis();

        System.out.println("Ok");
        Thread.currentThread().sleep(3000);

        timeout = System.currentTimeMillis() - timeout;
        System.out.println("And, " + timeout / 1000 + "c.");
    }
}
