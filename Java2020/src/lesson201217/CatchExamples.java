package lesson201217;

public class CatchExamples {
	
	public static void main(String[] args) {
		
		try {
			process(10, 5);
		} catch (IllegalArgumentException | ArithmeticException iae) {
			System.out.println(iae);
		} catch (RuntimeException re) {
			System.out.println(re);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("finished");
		
	}
	
	static int process(int x, int y) throws Exception {
		
		if (x < 0) {
			throw new IllegalArgumentException("no negative numbers!");
		}
		
		int result = x / y;
		
		furtherProcessing(result);
		
		moreProcessing();
		
		return result;
	}

	private static void moreProcessing() throws Exception {
		throw new Exception("very bad thing happened");
	}

	private static void furtherProcessing(int result) {
		throw new RuntimeException(); // something bad happened
	}

}
