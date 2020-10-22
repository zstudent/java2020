package lesson201022;

public class A extends Object {

	// fields,  state
	int statePart1 = 0;
	int statePart2 = 0;
	String statePart3 = "";

	// behavior (reaction)

	public void m0() {}
	
	public void m1() {  // mutator
		statePart1++;  // mutates the state of the object
		System.out.println("m1 from A");
	}
	
}
