package play.test;
import java.util.concurrent.Semaphore;

public class SemaphoreSynchronousQueue<E> {
	E item = null;
//	Semaphore sync = new Semaphore(0);
//	Semaphore send = new Semaphore(1);
//	Semaphore recv = new Semaphore(0);

	public E take() throws InterruptedException {
//		recv.acquire();
		E x = item;
//		sync.release();
//		send.release();
		return x;
	}

	public void put(E x) throws InterruptedException {
//		send.acquire();
		item = x;
//		recv.release();
//		sync.acquire();
	}
}