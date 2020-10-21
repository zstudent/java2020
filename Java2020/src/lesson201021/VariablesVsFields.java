package lesson201021;

public class VariablesVsFields {
	
	static int x; // class field
	
	int y;  // instance/object field
	
	private void m() {
		int a = 10;
		int b;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		b = a + 10;
		System.out.println(b);
		
		n();
	}
	
	private void n() {
		y++;
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		VariablesVsFields v = new VariablesVsFields();
		VariablesVsFields v2 = new VariablesVsFields();
		v.m();
	}
	
	
}
