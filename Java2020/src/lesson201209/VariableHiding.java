package lesson201209;

public class VariableHiding {
	
	public static void main(String[] args) {
		
		System.out.println(new A());
		System.out.println(new B());
	}

}


class A {
	int x = 10;
	
	@Override
	public String toString() {
		return super.toString() + " x = " + x;
	}
}

class B extends A {
	int x = 20;
	
	@Override
	public String toString() {
		return super.toString() + " x = " + x + " parent x = " + super.x;
	}
}
