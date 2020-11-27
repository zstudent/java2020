package lesson201127;

public class ArraysExamples3 {
	
	public static void main(String[] args) {
		
		String[] s1 = {"hello"};
//		String[] s2 = {};
		Object[]  o = s1;
//		StringBuilder[] s3 = (StringBuilder[]) o;
//		s3[0] = new StringBuilder();  COMPILE ERROR!
//		System.out.println(o);
//		o[0] = new StringBuilder();
		
		o = new Object[2];
		o[0] = "hello";
		o[1] = new StringBuilder();
	}

}
