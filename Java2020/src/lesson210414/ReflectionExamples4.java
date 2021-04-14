package lesson210414;

import java.lang.reflect.Field;

public class ReflectionExamples4 {
	
	public static void main(String[] args) {
		
		Object o = new B();
		
		json(o);
	}

	private static void json(Object o) {
		System.out.println("{");
		
		for (Field field : o.getClass().getFields()) {
			System.out.print(field.getName() + " : ");
			try {
				int value = field.getInt(o);
				System.out.println(value);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("}");
	}

}


class B {
	public int i = 10; 
	public int j = 20; 
}