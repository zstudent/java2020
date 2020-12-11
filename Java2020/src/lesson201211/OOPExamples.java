package lesson201211;

public class OOPExamples {

	public static void main(String[] args) {

		C c = new C();

		D d = new D();

		X x = d;
		
		Class<? extends X> clazz = x.getClass();
		System.out.println(clazz);
		
		L l = c;

	}

}

interface I {
	void i();  // public & abstract implicitly
}

interface J {
	void j();
}

interface K {
	void k();
}

interface L {
	void l();
}

interface M {
	void m();
}

interface X extends I, J, K, L, M {
	void x();
}

class A implements I, J {

	@Override
	public void j() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void i() {
		// TODO Auto-generated method stub
		
	}
}

class B extends A implements K, L {

	@Override
	public void l() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void k() {
		// TODO Auto-generated method stub
		
	}
}

class C extends B implements M {

	@Override
	public void m() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void k() {
	}
}

class D implements X {
	public void d() {
	}

	@Override
	public void i() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void j() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void k() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void l() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void x() {
		// TODO Auto-generated method stub
		
	}
}