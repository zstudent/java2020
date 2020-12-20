package lesson201216;

public class UseStack {

	public static void main(String[] args) {

		Stack s = new Stack(3);

		try {
			s.push(1);
			s.push(2);
			s.push(3);
			s.push(4);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		while (true) {
			try {
				System.out.println(s.pop());
			} catch (Exception e) {
				System.out.println(e);
				break;
			}
		}

		System.out.println("finish");
	}

}
