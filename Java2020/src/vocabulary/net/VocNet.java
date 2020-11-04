package vocabulary.net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import vocabulary.core.Vocabulary;
import vocabulary.smaples.Samples;

public class VocNet {
	
	public static void main(String[] args) {
		
		System.out.println("start");

		Vocabulary voc = 
				Vocabulary.builder()
				.setData(Samples.data)
				.build();
		
		try {
			ServerSocket ss = new ServerSocket(15000);
			Socket socket = ss.accept();
			Scanner scanner = new Scanner(socket.getInputStream());
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			while (scanner.hasNextLine()) {
				String word = scanner.nextLine();
				pw.println(voc.translate(word));
				pw.println(voc.describe(word));
				pw.println(voc.synonims(word));
				pw.println();
				pw.flush();
			}
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
