package lesson201026;

public class ReferenceInitialValue {
	
	public static void main(String[] args) {
		E e = new E();
		e.process();
		
		String str;
		
//		System.out.println(str.length());  ERROR: not initialized
	}

}


class E {
	String s = "";  // default value is null!
	
	void process() {
		System.out.println(s.length());
	}
}
