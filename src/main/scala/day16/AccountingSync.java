package day16;

/**
 * Created by doctorq on 2017/7/5.
 * 讲解synchronized
 */
public class AccountingSync implements Runnable {

    static int i = 0;

    public synchronized void increate() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 1000000; j++) {
            increate();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        AccountingSync instance = new AccountingSync();
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);

    }
}
