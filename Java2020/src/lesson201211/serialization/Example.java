package lesson201211.serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Example {

	public static void main(final String[] args) throws IOException, ClassNotFoundException {

		final Person mike = new Person("Mike", 40, new Address("French", "Boston"));
		System.out.println(mike);
		System.out.println(mike.getClass());
		
		
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		final ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		oos.writeObject(mike);
		
		baos.flush();
		
		final byte[] byteArray = baos.toByteArray();
		
		System.out.println(Arrays.toString(byteArray));
		System.out.println(new String(byteArray));
		
		final ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
		
		final ObjectInputStream ois = new ObjectInputStream(bais);
		
		final Object readObject = ois.readObject();
		System.out.println(readObject);
		System.out.println(readObject.getClass());
		
		final Person mikeCopy = (Person) readObject;
		
		System.out.println(mikeCopy.name);
		System.out.println(mikeCopy.age);
		System.out.println(mikeCopy.address);
	}

}
