package lesson210129;

import java.util.ArrayList;
import java.util.List;

public class Question17LazyInit {
	
	public static void main(String[] args) {
		A2 a = new A2();
		a.getList();
		a.getList();
	}

}


class A2 {
	
	List<Integer> l2;
	
	List<Integer> getList() {
		if (l2 == null) {
			l2 = new ArrayList<>(1_000_000);
		}
		return l2;
	}
}