package lesson210406;

public class AutoClosableExample {
	
	public static void main(String[] args) {
		
		try (Resource r = new Resource()) {
			System.out.println("opened");
		}
		
		Resource r = new Resource();
		
		try {
			System.out.println("opened");
		} finally {
			r.close();
		}
		
	}

}


class Resource implements AutoCloseable {

	@Override
	public void close() {
		System.out.println("closed");
	}
	
}