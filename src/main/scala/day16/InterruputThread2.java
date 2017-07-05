package day16;

import java.util.concurrent.TimeUnit;

/**
 * Created by doctorq on 2017/7/5.
 */
public class InterruputThread2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("未被中断");
                    if (this.isInterrupted()) {
                        System.out.println("线程中断");
                        break;
                    }
                }
                System.out.println("已跳出循环,线程中断!");
                System.out.println(this.isInterrupted());
            }
        };
        t1.start();
        TimeUnit.SECONDS.sleep(2);
        t1.interrupt();
        System.out.println(t1.isInterrupted());

    }
}
