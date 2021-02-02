package lesson210202;

public class ExamQuestion_1_3 {

	public static void main(String[] args) {

		String s1 = "Canada";
		String s2 = new String(s1); // interning works
		String s3 = new String(s1).intern();
		if (s1 == s2)
			System.out.println("s1 == s2");
		if (s1 == s3)
			System.out.println("s1 == s3");
		if (s1.equals(s2))
			System.out.println("s1.equals(s2)");
	}

}
