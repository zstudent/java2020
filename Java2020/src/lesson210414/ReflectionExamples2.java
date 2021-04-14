package lesson210414;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExamples2 {
	
	public static void main(String[] args) {
		
		Object o = new TestCase();
		
		invoke(o);
		
	}

	private static void invoke(Object o){
		Method[] methods = o.getClass().getMethods();
		
		for (Method method : methods) {
			if (method.getName().startsWith("test")) {
				try {
					method.invoke(o);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
