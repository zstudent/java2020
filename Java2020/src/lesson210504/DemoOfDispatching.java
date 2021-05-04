package lesson210504;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import lesson210504.Command.Load;
import lesson210504.Command.Save;
import lesson210504.Command.Search;

public class DemoOfDispatching {
	// with example of explicit class casting

	public static void main(String[] args) {

		
		
		//  send the message via internet
		
		dispatch(pack(new Command.Load()));
		dispatch(pack(new Command.Search()));
		dispatch(pack(new Command.Save()));

	}

	private static void dispatch(byte[] message) {
		Command c = unpack(message);
		
		if (c instanceof Command.Load) {
			execute((Command.Load) c);
		} else if (c instanceof Command.Save) {
			execute((Command.Save) c);
		} else if (c instanceof Command.Search) {
			execute((Command.Search) c);
		}
		
	}

	private static void execute(Search c) {
		System.out.println("searching...");
	}

	private static void execute(Save c) {
		System.out.println("saving...");
	}

	private static void execute(Load c) {
		System.out.println("loading...");
	}

	private static Command unpack(byte[] message) {
		try (ByteArrayInputStream bais = new ByteArrayInputStream(message); 
				ObjectInputStream ois = new ObjectInputStream(bais)) {
			
			Object readObject = ois.readObject();
			
			return (Command) readObject;
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] pack(Command c) {
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos)) {
			oos.writeObject(c);
			return baos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

}
