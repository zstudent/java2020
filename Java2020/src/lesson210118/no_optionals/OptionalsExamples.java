package lesson210118.no_optionals;

public class OptionalsExamples {
	

	static String getCarInsuranceName(Person person) {
		return person.getCar().getInsurance().getName();
	}
	
	static String getCarInsuranceName2(Person person) {
		if (person != null) {
			Car car = person.getCar();
			if (car != null) {
				Insurance insurance = car.getInsurance();
				if (insurance != null) {
					return insurance.getName();
				}
			}
		}
		return "Unknown";
	}
	
	static String getCarInsuranceName3(Person person) {
		if (person == null) 
			return "Unknown";
		
		Car car = person.getCar();
		
		if (car == null) 
			return "Unknown";
			
		Insurance insurance = car.getInsurance();
			
		if (insurance == null) 
			return "Unknown";
			
		return insurance.getName();
	}
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		getCarInsuranceName(person);
		
	}
	
}
