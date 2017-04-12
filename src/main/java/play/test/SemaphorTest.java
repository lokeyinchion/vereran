package play.test;

public class SemaphorTest {
	private static SemaphoreSynchronousQueue<String> ssq = new SemaphoreSynchronousQueue<String>();
	public static void main(String []args) throws InterruptedException{
		ssq.put("abc");
		String a =ssq.take();
		ssq.put("def");
		System.out.println(a);
	}

}
