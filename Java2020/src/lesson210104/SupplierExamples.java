package lesson210104;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExamples {

	public static void main(String[] args) {

		Supplier<LocalDate> s1 = () -> LocalDate.now();
		Supplier<LocalDate> s2 = LocalDate::now;

		System.out.println(s1.get());
		System.out.println(s2.get());
		
		Supplier<List<String>> s3 = () -> {
			return new ArrayList<String>();
		};

		Supplier<List<String>> s4 = ArrayList<String>::new;
		
	}

}
