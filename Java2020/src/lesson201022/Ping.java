package lesson201022;

import utils.Time;

public class Ping {
	
	public void act(Pong p) {
//		System.out.println("Received message act from " + p);
//		Time.pause(2000);
		p.act(this);
	}

}
