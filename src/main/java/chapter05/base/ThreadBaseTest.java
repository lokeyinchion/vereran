package chapter05.base;

/**
 * @author Yingchuan Lu
 *
 */
public class ThreadBaseTest {

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread() {
            @Override
            public void run() {
                //                System.out.println(Thread.currentThread().getName());
                System.out.println("���Ǳ��������̣߳���ִ����...");
            }
        };
        myThread.start();
        Thread.sleep(1);
        //        System.out.println(Thread.currentThread().getName());
        System.out.println("main process end...");
        myThread.join();
    }
}
