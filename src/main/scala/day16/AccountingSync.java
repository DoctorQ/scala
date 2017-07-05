package day16;

/**
 * Created by doctorq on 2017/7/5.
 * 讲解synchronized
 */
public class AccountingSync implements Runnable {

    static int i = 0;


    @Override
    public void run() {
        synchronized (AccountingSync.class) {
            for (int j = 0; j < 1000000; j++) {
                i++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AccountingSync instance = new AccountingSync();
        AccountingSync instance1 = new AccountingSync();
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);

    }
}
