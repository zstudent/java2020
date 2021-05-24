package lesson210524;

import java.lang.reflect.Field;

public class ReflectionMapping {
	
	public static void main(String[] args) {
		
		User user = new User();
		user.id = 1;
		user.name = "Ann";
		
		String query = generateInsertStatement(user);
		
		System.out.println(query);
		
	}

	public static String generateInsertStatement(Object o) {
		StringBuilder sb = new StringBuilder();
		sb.append("insert into ");
		Class<? extends Object> clazz = o.getClass();
		sb.append(clazz.getSimpleName()).append(" set ");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
				sb.append(field.getName()).append(" = ")
				.append(getValueString(o, field)).append(", ");
		}
		
		int last = sb.length()-1;
		sb.delete(last-1, last);
		return sb.toString();
	}

	private static String getValueString(Object o, Field field){
		try {
			Object value;
			value = field.get(o);
			return field.getType().getSimpleName().equals("String") ? "'" + value + "'" : value.toString();
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}

}
