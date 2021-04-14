package lesson210414;

public class TestCase2 {
	
	String name;
	
	public void test1() {
		System.out.println("test1");
	}

	public void test2() {
		System.out.println("test2");
	}
	
	public void test3() {
		System.out.println("test3");
	}
	
	@OurTest(count = 3)
	public void other() {
		System.out.println("other");
	}
	
}
