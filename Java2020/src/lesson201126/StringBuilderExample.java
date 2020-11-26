package lesson201126;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		
		// Builder design pattern
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 10; i++) {
			sb.append(i);
		}
		System.out.println(sb);
		
		// chain call example
		sb.append(" - this is an example")
		.append(" of another approach")
		.append(10)
		.append(true);
		
		String s = sb.toString();
		
		
		System.out.println(s);
	}

}
