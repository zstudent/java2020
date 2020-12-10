package lesson201210;

public class DependencyInversionPrinciple {
	
	public static void main(String[] args) {
		Switchable lamp = new Lamp();
		Switch s = new Switch(lamp);
		s.flip();
		s.flip();
		s.flip();
		
		Switch s2 = new Switch(new Frige());
		s2.flip();
		s2.flip();
	}
	

}

class Lamp implements Switchable {
	
	private boolean isOn = false;

	@Override
	public void on() {
		System.out.println("Light is on");
		isOn = true;
	}

	@Override
	public void off() {
		System.out.println("Light is off");
		isOn = false;
	}

	@Override
	public boolean isOn() {
		return isOn;
	}
	
}

class Frige implements Switchable {

	@Override
	public void on() {
		// TODO Auto-generated method stub
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return false;
	}
	
}


class Switch {
	Switchable device;

	public Switch(Switchable device) {
		this.device = device;
	}

	public void flip() {
		if (device.isOn()) {
			device.off();
		} else {
			device.on();
		}
	}
}