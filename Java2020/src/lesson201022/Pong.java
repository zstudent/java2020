package lesson201022;

import utils.Time;

public class Pong {

	public void act(Ping p) {
//		System.out.println("Received message act from " + p);
//		Time.pause(2000);
		p.act(this);
	}

}
