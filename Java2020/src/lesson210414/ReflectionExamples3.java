package lesson210414;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExamples3 {
	
	public static void main(String[] args) {
		
		Object o = new TestCase2();
		invoke(o);
		
	}

	private static void invoke(Object o){
		Method[] methods = o.getClass().getMethods();
		
		for (Method method : methods) {
			System.out.println(Arrays.toString(method.getAnnotations()));
			for (Annotation a : method.getAnnotations()) {
				if (a.annotationType().getSimpleName().equals("OurTest")) {
					int count = ((OurTest) a).count();
					try {
						for (int i = 0; i < count; i++) {
							method.invoke(o);
						}
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					};
				}
			}
		}
	}

}
