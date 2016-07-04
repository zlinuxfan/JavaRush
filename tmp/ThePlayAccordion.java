package forTest;


public class ThePlayAccordion {
    public static void main(String[] args) throws InterruptedException
    {
        Runnable startAcc = new startAccordion();
        Thread threadAcc = new Thread(startAcc);
        threadAcc.start();
    }

    static class startAccordion implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 7; i ++) {
                try {
                    Runnable printerA = new PrintRunnable("A    .", 100);
                    Thread threadA = new Thread(printerA);
                    threadA.start();

                    Runnable printerB = new PrintRunnable(".    B", 99);
                    Thread threadB = new Thread(printerB);
                    threadB.start();

                    threadA.join();
                    threadB.join();

                    Runnable printerC = new PrintRunnable("  C", 100);
                    Thread thread = new Thread(printerC);
                    thread.start();
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
