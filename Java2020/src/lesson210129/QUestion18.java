package lesson210129;

public class QUestion18 {
	
	public static void main(String[] args) {
		
		N n = new N(new M());
		N n2 = new N(new M() {
			
		});
		
		n.doSomething();
		n2.doSomething();
		
	}

}


class M {
	
}


class N {
	M m;
	
	public N(M m) {
		this.m = m;
	}
	
	void doSomething() {
		System.out.println(m.toString());
	}
}