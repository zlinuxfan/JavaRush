package forTest;

/**
 * Created by ZLinuxFan on 15.06.2016.
 */
public class testForThread {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new XRunnable());
        thread.start();

        for (int i = 0 ; i < 1000; i ++ ) {
            Thread.sleep(99);
            System.out.println("main: " + i);
        }
    }
}

class XRunnable implements Runnable {
    public void run()
    {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(399);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run: " + i);
        }
    }
}
