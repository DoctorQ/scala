package day16;

/**
 * Created by doctorq on 2017/7/5.
 * 讲解synchronized
 */
public class AccountingSync implements Runnable {

    static int i = 0;
    static int j = 0;

    public void increase() {
        j++;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int j = 0; j < 1000000; j++) {
                i++;
                increase();
            }
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
        System.out.println(j);

    }
}
