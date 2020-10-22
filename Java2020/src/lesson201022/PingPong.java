package lesson201022;

public class PingPong {
	
	public static void main(String[] args) {
		Ping ping = new Ping();
		Pong pong = new Pong();
		
		ping.act(pong);
	}

}
