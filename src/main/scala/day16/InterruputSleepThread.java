package day16;

import java.util.concurrent.TimeUnit;

/**
 * Created by doctorq on 2017/7/5.
 * 线程中断
 */
public class InterruputSleepThread {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                //while在try中，通过异常中断就可以退出run循环
                try {
                    while (!Thread.interrupted()) {
                        //当前线程处于阻塞状态，异常必须捕捉处理，无法往外抛出
                        TimeUnit.SECONDS.sleep(2);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Interruted When Sleep");
                    boolean interrupt = this.isInterrupted();
                    //中断状态被复位
                    System.out.println("interrupt:" + interrupt);
                }
            }
        };
        t1.start();
        TimeUnit.SECONDS.sleep(2);
        System.out.println(t1.isInterrupted());
        t1.interrupt();
        System.out.println(t1.isInterrupted());
        System.out.println("test: " + t1.isInterrupted());
    }
}
