package lesson210412;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Question21 {
	
	
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		Zebra original = new Zebra();
		original.setTail("tail");
		
		oos.writeObject(original);
		
		oos.close();
		
		byte[] byteArray = baos.toByteArray();

		ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
		
		ObjectInputStream ois = new ObjectInputStream(bais);
		
		Zebra copy;
		try {
			copy = (Zebra) ois.readObject();
			System.out.println(copy.getName());
			System.out.println(copy.getTail());
			System.out.println(copy.getAge());
			System.out.println(copy.getFriends());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

class Zebra implements Serializable {
	private static final long serialUID = 1L;
	private transient String name = "George";
	private static String birthPlace = "Africa";
	private transient int age;
	private java.util.List<Zebra> friends = new java.util.ArrayList<>();
	private Object tail = null;
	{
		age = 10;
	}

	public Zebra() {
		this.name = "Sophia";
	}


	public void setTail(String string) {
		tail = string;
	}


	public static long getSerialuid() {
		return serialUID;
	}

	public String getName() {
		return name;
	}

	public static String getBirthPlace() {
		return birthPlace;
	}

	public int getAge() {
		return age;
	}

	public java.util.List<Zebra> getFriends() {
		return friends;
	}

	public Object getTail() {
		return tail;
	}


}