package lesson201210;

import java.util.Arrays;
import java.util.List;

public class Interfaces {
	
	public static void main(String[] args) {
		List<Soundable> list = Arrays.asList(
				new Drum(), 
				new Violin(), 
				new Furniture.WoodenTable(),
				new Furniture.PlasticChair());
		
		list.forEach(System.out::println);
		list.forEach(i -> System.out.println(i.sound()));
//		list.forEach(i -> {
//			String sound = "";
//			if (i instanceof Furniture) {
//				 sound = ((Furniture) i).sound();
//			}
//			if (i instanceof Instrument) {
//				sound = ((Instrument) i).sound();
//			}
//			System.out.println(sound);
//		});
	}

}


abstract class Instrument implements Soundable {
}

abstract class Percussion extends Instrument {}

abstract class StringInstrument extends Instrument {}

class Drum extends Percussion {
	@Override
	public
	String sound() {
		return "bum";
	}
}

class Violin extends StringInstrument {

	@Override
	public
	String sound() {
		return "viii";
	}}