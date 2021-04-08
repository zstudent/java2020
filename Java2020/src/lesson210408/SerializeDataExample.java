package lesson210408;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDataExample {
	
	public static void main(String[] args) throws IOException {
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
//		oos.writeObject(new A());   Runtime error: A is not serializable
		oos.writeObject(new Data());
		
		oos.close();
		
		byte[] byteArray = baos.toByteArray();

		for (byte b : byteArray) {
			if (b < 32) 
				continue;
			System.out.print((char)b);
		}
		System.out.println();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
		
		ObjectInputStream ois = new ObjectInputStream(bais);
		
		D copy;
		try {
			copy = (D) ois.readObject();
			System.out.println(copy.s());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
	}

}


class A {
	String s = "A";
}