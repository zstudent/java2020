package lesson201217;

public class FinallyExample {
	
	public static void main(String[] args) {
		System.out.println("start");
		seriousProcess();
		System.out.println("finish");
		
	}
	
	static void seriousProcess() {
		Object resource = step1();
		try {
			step2(resource);
			step3(resource);
		} catch (RuntimeException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		} finally {
			release(resource);
		}
		// futher steps
	}


	private static Object step1() {
		return "Important Resource";
	}

	private static void step2(Object resource) {
		System.out.println("step 2 start");
		throw new RuntimeException();
//		System.out.println("step 2 end");  NEVER REACHED
	}

	private static void step3(Object resource) {
		System.out.println("step 3");
	}

	private static void release(Object resource) {
		System.out.println("release " + resource);
	}
}
