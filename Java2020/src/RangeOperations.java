import java.util.NavigableSet;
import java.util.TreeSet;

public class RangeOperations {
	
	public static void main(String[] args) {
		
		NavigableSet<String> set = new TreeSet<String>();
		
		set.add("Pete");
		set.add("John");
		set.add("Ann");
		set.add("Mike");
		set.add("Bob");
		set.add("Dave");
		set.add("Jack");
		set.add("Sue");
		set.add("Millie");
		set.add("Nancie");
		
		System.out.println(set);
		System.out.println(set.lower("Dave"));
		System.out.println(set.higher("Dave"));
		System.out.println(set.tailSet("Millie"));
		
	}

}
