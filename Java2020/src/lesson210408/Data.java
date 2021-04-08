package lesson210408;

import java.io.Serializable;

public class Data implements Serializable, D {
	public static final long serialVersionUID = 1L;
	
	String s = "hello";
	int i = 10;
	C c = new C();
	transient Thread t = Thread.currentThread();

	@Override
	public String s() {
		return s;
	}
}
