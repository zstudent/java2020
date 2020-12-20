package lesson201216;

public class Exceptions1 {
	
	private static final int OK = 0;
	private static final int ERROR_ZERO_ARG = 100;

	static class Data {  //context
		int x, y, z;
	}
	
	
	public static void main(String[] args) {
		
		Data data = new Data();
		
		int resultCode = calculate(data, 10, 0);
		if (resultCode == 0) {
			System.out.println(data.z);
		} else {
			System.out.println("error: " + resultCode);
		}
		
		Context context = new Context();
		context.data = data;
		context.x = 30;
		context.y = 10;
		
		calculate(context);
		
		calculate(10l, 0L);
		
	}

	private static void calculate(Context context) {
		context.resultCode = calculate(context.data, context.x, context.y);
	}

	private static int calculate(Data data, int x, int y) {
		if (y == 0) {
			return ERROR_ZERO_ARG;
		}
		data.x = x; 
		data.y = y; 
		data.z = data.x / data.y;
		return OK;
	}
	
	static Context calculate(int x, int y) {
		Context c = new Context();
		c.data = new Data();
		c.data.x = c.x = x;
		c.data.y = c.y = y;
		c.data.x = x / y;
		c.resultCode = 0;
		return c;
	}

	static class Context {
		Data data;
		int resultCode;
		int x, y;
	}
	
	static long calculate(long x, long y) {
		if (y == 0) {
			throw new IllegalArgumentException("y cannot be zero");
		}
		return x / y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
