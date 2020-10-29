package lesson201029;

public class OperationsExamples {
	
	public static void main(String[] args) {
		
		boolean a = false;
		boolean b = true;
		
		System.out.println(!a);
		
		int bt = 5;
		
		System.out.println(Integer.toBinaryString(bt));
		System.out.println(Integer.toBinaryString(~bt));
		
		int k = 10;
		
		System.out.println(k<<1);
		System.out.println(Integer.toBinaryString(k<<1));
		
		int j = 7;
		
		int m = 3;
		
		System.out.println(Integer.toBinaryString(j));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(j&m));
		
		j /= 10;  // j = j / 10
		
		System.out.println(j < m);
		System.out.println(j <= m);
		System.out.println(j > m);
		System.out.println(j >= m);
		
	}

}
