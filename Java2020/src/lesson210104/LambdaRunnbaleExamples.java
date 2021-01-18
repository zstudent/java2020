package lesson210104;

public class LambdaRunnbaleExamples {
	
	public static void main(String[] args) {
		
		Runnable t = new Runnable() {
			@Override
			public void run() {
				System.out.println("hello");
			}
		}; 
		
		long elapsed = elapsed(t);
		
		System.out.println("elapsed: " + elapsed);
		
		System.out.println(elapsed(()-> System.out.println("world")));
		
	}
	
	public static long elapsed(Runnable task) {
		long start = System.nanoTime();
		task.run();
		long stop = System.nanoTime();
		return stop - start;
	}

}
