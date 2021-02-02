package lesson210128;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FinalExamples {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		A a = new A(list);
		System.out.println(a);
		list.add(20);
		System.out.println(a);
		a.getList().add(10);
		System.out.println(a);
	}

}

class B extends A {
	
	public B(List<Integer> list) {
		super(list);
	}
	
}

class A {
	private final int x;
	final private List<Integer> list;
	
	public A(List<Integer> list) {
		x = 10;
		this.list = new ArrayList<>(list);
	}
	
	public List<Integer> getList() { return Collections.unmodifiableList(list); }
	public List<Integer> getCopy() { return new ArrayList<Integer>(list); }
	
	@Override
	public String toString() {
		return x + " " + list;
	}
}