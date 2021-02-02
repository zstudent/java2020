package lesson210128;

public class MultipleInterfaces {

}

interface X {
	void x();
	default void xx() {}
	static void xxx() {}
	final static int dd = 10;
}
interface Y {}
interface Z extends X, Y {}
interface W {}

//class F implements Z {}  ERROR!

//class G extends F implements W {}  ERROR!

