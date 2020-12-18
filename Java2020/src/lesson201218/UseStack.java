package lesson201218;

public class UseStack {
	
	public static void main(String[] args) throws Exception {
		Stack<String> s = new Stack<>(10);
		
		s.push("hello");
//		s.push(10); //auto-boxing works here!  ERROR: wrong type
//		s.push(new Integer(20));
//		s.push(new Object());
		
		s.push("one");
		
		process(s);
	}

	private static void process(Stack s) throws Exception {
		while (!s.isEmpty()) {
			Object o = s.pop();
			String str = (String) o;
			System.out.println(str.length());
		}
	}

}
