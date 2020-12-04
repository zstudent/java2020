package vocabulary.net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import vocabulary.core.Vocabulary;
import vocabulary.smaples.Samples;

public class VocNet {

	private static Vocabulary voc;

	public static void main(String[] args) {

		System.out.println("start");

		voc = Vocabulary.builder().setData(Samples.data).build();

		ExecutorService pool = Executors.newCachedThreadPool();

		try {
			ServerSocket ss = new ServerSocket(15000);
			while (true) {
				Socket socket = ss.accept();
				pool.execute(() -> {
					try {
						process(socket);
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
			}
//			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void process(Socket socket) throws IOException {
		System.out.println(socket);
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
	}

}
