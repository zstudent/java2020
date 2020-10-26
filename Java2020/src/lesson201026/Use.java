package lesson201026;

public class Use {
	
	public static void main(String[] args) {
//		A a = new A(); no default constructor!
		
		new A(10);
		new B();
		new B(0);
		new B(0,0);

		Point p = new Point();
//		p.move(10, 10);
		p.move(10);
//		p.x = 11; p.y = -9;  ERROR: not visible!
		
		String s = "Hello";
		System.out.println(s.length());
		
	}

}
