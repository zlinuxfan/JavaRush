package forTest;


public class PrintRunnable implements Runnable{
    private String str = "";
    private int msec = 0;
    public PrintRunnable(String _str, int _msec) {
        this.str = _str;
        this.msec = _msec;
    }

    @Override
    public void run() {
        for (int i = 0; i < 7; i ++) {
            try
            {
                Thread.sleep(msec);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(str);
        }
    }
}
