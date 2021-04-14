package lesson210414;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExamples1 {
	
	public static void main(String[] args) {
		
		Object o = new A();
		
		invoke(o, "m1");
		invoke("hello", "m1");
		
	}

	private static void invoke(Object o, String methodName){
		Method[] methods = o.getClass().getMethods();
		
		for (Method method : methods) {
//			System.out.println(method);
			if (method.getName().equals(methodName)) {
				try {
					method.invoke(o);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
