package lesson201211.serialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Address implements Serializable {
	public Address(final String street, final String city) {
		this.street = street;
		this.city = city;
	}
	String street;
	String city;
}
