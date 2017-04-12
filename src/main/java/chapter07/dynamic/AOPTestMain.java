package chapter07.dynamic;

public class AOPTestMain {

	public static void main(String []args) {
		try {
			HelloInterface hello = BeanFactory.getBean("chapter07.dynamic.HelloImpl" , HelloInterface.class);
			hello.setInfo("xieyuooo", "xiaopang");
			hello.getInfos1();
			hello.getInfos2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
