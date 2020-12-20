package lesson201214;

public class InnerClass {
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
//		Outer.Nested nested = new Outer.Nested();
		Outer.Inner inner = outer.new Inner();
		
	}

}


class Outer {
	
//	static class Nested {
//		void process() {
//			m();                            ERROR
//			System.out.println(state);      ERROR
//		}
//	}
	
	static class Explainer {
		private Outer outer;
		public Explainer(Outer outer) {
			this.outer = outer;
		}
		void process() {
			outer.m();
			System.out.println(outer.state);
		}
	}
	
	class Inner {
		void process() {
			Outer.this.m();
			System.out.println(Outer.this.state);
		}
	}
	
	int state;
	
	void m() {
		this.state++;
	}
}