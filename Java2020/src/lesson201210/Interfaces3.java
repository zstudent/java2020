package lesson201210;

import java.util.Arrays;
import java.util.List;

public class Interfaces3 {

	public static void main(String[] args) {

		Violin violin = new Violin();
		Drum drum = new Drum();
		Furniture.WoodenTable table = new Furniture.WoodenTable();
		Furniture.PlasticChair chair = new Furniture.PlasticChair();
		
		List<Soundable> list = Arrays.asList(violin, drum, table, chair);
		
		list.forEach(Interfaces3::process);

	}
	
	static void process(Soundable something) {
		System.out.println(something.sound());
	}

}
