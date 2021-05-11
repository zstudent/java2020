package lesson210507;

import java.util.List;

public class Car {
	private Engine engine;
	List<Wheel> wheels;
	Engine getEngine() {
		return engine;
	}
	void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void move() {
		engine.start();
	}
}
